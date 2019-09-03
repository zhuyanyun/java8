package thinkjava.chapter_15.ca7;

import sun.rmi.rmic.iiop.Generator;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-09-03 19:14
 * @Vertion 1.0
 **/
class GenericBase<T>{

    private T element;
    public void set(T arg){
        element = arg;
    }
    public T get(){
        return element;
    }
}

class Derived1<T> extends GenericBase<T>{}

class Derived2 extends GenericBase{}



public class ErasureAndInheritance {
    public static void main(String[] args) {
        Derived2 derived2 = new Derived2();
        Object obj = derived2.get();
        derived2.set(obj);
    }
}
