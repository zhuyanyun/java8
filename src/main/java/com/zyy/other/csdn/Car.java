package com.zyy.other.csdn;

import java.util.function.Supplier;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/8/27 上午11:22
 * @Vertion 1.0
 **/
public class Car {
    public static Car create( final Supplier< Car > supplier ) {
        return supplier.get();
    }

    public static void collide( final Car car ) {
        System.out.println( "Collided " + car.toString() );
    }

    public void follow( final Car another ) {
        System.out.println( "Following the " + another.toString() );
    }

    public void repair() {
        System.out.println( "Repaired " + this.toString() );
    }
}
