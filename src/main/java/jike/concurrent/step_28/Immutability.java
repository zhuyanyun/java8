package jike.concurrent.step_28;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-03 18:27
 * @Vertion 1.0
 **/
public class Immutability {

    public static void main(String[] args) {

         final class Account{
            private final
            StringBuffer user;
            public Account(String user){
                this.user =
                        new StringBuffer(user);
            }

            public StringBuffer getUser(){
                return this.user;
            }
            public String toString(){
                return "user"+user;
            }
        }

    }
}
