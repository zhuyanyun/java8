package design.patterns.chapter_9;

import java.util.Enumeration;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-09 15:02
 * @Vertion 1.0
 **/
public class MenuTestDrive {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(dinerMenu);
        waitress.printMenu();

//        Enumeration
    }
}
