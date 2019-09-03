package thinkjava.chapter_15.fanxing;

import thinkjava.chapter_15.generac.Generator;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-30 16:51
 * @Vertion 1.0
 **/
public class Fibonacci implements Generator<Integer> {

    private int count = 0;

    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n){
        if(n < 2){
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for(int i = 0; i < 18; i++){
            System.out.println(gen.next() + " ");
        }
    }
}
