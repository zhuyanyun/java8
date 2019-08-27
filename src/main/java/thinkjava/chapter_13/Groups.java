package thinkjava.chapter_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-27 16:00
 * @Vertion 1.0
 **/
public class Groups {
    static public final String POEM = "Twas brilliig. and the ality thves\n" +
            "Did gyre and gimble in the wabe.\n" +
            "All mimsy where the borogoves,\n"+
            "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);

        int i = 0;
        while (m.find()){
            for(int j = 0; j <= m.groupCount(); j++){
                System.out.println("[" + m.group(j) + "]");
            }
            System.out.println("========" + ++i);
        }
    }
}
