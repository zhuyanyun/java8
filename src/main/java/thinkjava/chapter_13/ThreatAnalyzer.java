package thinkjava.chapter_13;

import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-27 19:34
 * @Vertion 1.0
 **/
public class ThreatAnalyzer {
    static String threadData =
            "58.27.82.161@02/10/11/2005\n"+
            "204.45.234.40@02/11/2009\n"+
            "[Next log section with]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(threadData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@"+
                "(\\d{2}/\\{2}/\\d{4})";
        System.out.println(scanner.hasNext(pattern));
        while ((scanner.hasNext(pattern))){
            scanner.next(pattern);
            MatchResult match = scanner.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.format("Threat on %s from %s\n",date,ip);
        }
    }


}
