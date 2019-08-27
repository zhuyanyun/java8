package thinkjava.chapter_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-27 16:53
 * @Vertion 1.0
 **/
public class TheReplacements {

    public static void main(String[] args) {
        String s = "/*!Here's a block   of text to use as input to the regular expression\n"+" matcher.Note that we'll first extract the block of text by loking\n"+" for the special delimitesrs,then\n"+" process the extracted block.!*/";

        Matcher mImput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
        if(mImput.find()){
            s = mImput.group(1);
            System.out.println(s);
        }
        s = s.replaceAll(" {2,}"," ");
        s = s.replaceAll("(?m)^+","");

        s = s.replaceFirst("[aeiou]","(VOEEL!)");
        System.out.println(s);

        StringBuffer buf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);

        while(m.find()){
            m.appendReplacement(buf, m.group().toUpperCase());
        }
        System.out.println("========"+buf);
        m.appendTail(buf);


        System.out.println(buf);

    }


}
