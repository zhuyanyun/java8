package jike.perfectcode;

import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import java.util.Collections;
import java.util.List;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-07-31 18:18
 * @Vertion 1.0
 **/
public class ServerNameSpec<T> {

    final List<T> serverNames;

    ServerNameSpec(List serverNames) {
        this.serverNames = Collections.unmodifiableList(serverNames);
    }

    public void addServerName(SNIServerName serverName) {
        serverNames.add((T) serverName);
    }

    @Override
    public String toString() {
        if (serverNames == null || serverNames.isEmpty()){
            return "<no server name indicator specified>";
        }

        StringBuilder builder = new StringBuilder(512);
        for (T sn : serverNames) {
            builder.append(sn.toString());
            builder.append("\n");
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        ServerNameSpec<SNIServerName> test
                = new ServerNameSpec<SNIServerName>(Collections.singletonList(new SNIHostName("aaa")));
        test.addServerName(new SNIHostName("bbb"));
        System.out.println(test.toString());
    }


}
