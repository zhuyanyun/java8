package thinkjava.chapter_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-27 15:22
 * @Vertion 1.0
 **/
public class TestRegularExpression {
    public static void main(String[] args) {
        args = new String[]{"abcabcabcdeg","abc+","(abc)+","(abc){2,}"};

        if(args.length < 2){
            System.out.println("regularExpression");
            System.exit(0);
        }

        System.out.println("Input = " + args[0] +"\"");

        for(String arg : args){
            System.out.println("Regular expression");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while(m.find()){
                System.out.println("Match  \"" + m.group() +  "s:" + m.start() + "- " + (m.end() - 1));
            }
        }
    }
}
