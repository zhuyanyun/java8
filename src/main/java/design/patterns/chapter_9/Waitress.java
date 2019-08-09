package design.patterns.chapter_9;

import java.util.Iterator;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-09 14:55
 * @Vertion 1.0
 **/
public class Waitress {
    Menu dinerMenu;

    public Waitress(Menu dinerMenu) {
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator iterator = dinerMenu.createIterator();
        System.out.println("dinerMenu");
        printMenu(iterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + ",");
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        }
    }
}
