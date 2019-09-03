//: generics/coffee/Coffee.java
package thinkjava.chapter_15.fanxing;

public class Coffee {
  private static long counter = 0;
  private final long id = counter++;
  public String toString() {
     return getClass().getSimpleName() + " " + id;
  }
} ///:~
