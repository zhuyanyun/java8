package design.patterns.chapter_9;

import java.util.Iterator;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-09 09:24
 * @Vertion 1.0
 **/
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {

    }
}
