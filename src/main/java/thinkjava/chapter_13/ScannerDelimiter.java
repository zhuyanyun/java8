package thinkjava.chapter_13;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-27 19:28
 * @Vertion 1.0
 **/
public class ScannerDelimiter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("12,42,78=99,42");
        scanner.useDelimiter("\\s*[,|=]\\s*");
        while (scanner.hasNextInt()){
            System.out.println(scanner.nextInt());
        }
    }
}
