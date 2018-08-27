package com.zyy.other;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/8/27 上午10:49
 * @Vertion 1.0
 **/
public class Test3 {
    String sep = ",";

    @Test
    public void test1(){
        Arrays.asList("a","b","d").forEach((e) -> {
            System.out.println(e + sep);

            System.out.println("----------------------");
        });
    }

    public static class Car {
        public static Car create(final Supplier<Car> supplier ) {
            return supplier.get();
        }

        public static void collide( final com.zyy.other.csdn.Car car ) {
            System.out.println( "Collided " + car.toString() );
        }

        public void follow( final com.zyy.other.csdn.Car another ) {
            System.out.println( "Following the " + another.toString() );
        }

        public void repair() {
            System.out.println( "Repaired " + this.toString() );
        }
    }

    final Car car = Car.create(Car::new);
    final List<Car> cars = Arrays.asList(car);

//    cars.forEach( Car::collide);

//    cars.forEach( Car::repair);



}
