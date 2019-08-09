package design.patterns.chapter_9;

import java.util.Iterator;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-09 09:32
 * @Vertion 1.0
 **/
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegeraian BLT","sfasfasf",false,2.99);
        addItem("TTT","alglag",true,8.88);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS){
            System.out.println("Sorry,Can't add");
        }else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }

    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
