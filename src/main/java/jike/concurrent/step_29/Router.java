package jike.concurrent.step_29;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-03 20:56
 * @Vertion 1.0
 **/
public final  class Router {

    // 路由信息
    private final String  ip;
    private final Integer port;
    private final String  iface;
    // 构造函数
    public Router(String ip,
                  Integer port, String iface){
        this.ip = ip;
        this.port = port;
        this.iface = iface;
    }

    // 重写 equals 方法
    public boolean equals(Object obj){
        if (obj instanceof Router) {
            Router r = (Router)obj;
            return iface.equals(r.iface) &&
                    ip.equals(r.ip) &&
                    port.equals(r.port);
        }
        return false;
    }

    public int hashCode() {
        // 省略 hashCode 相关代码
        return 0;
    }
}
