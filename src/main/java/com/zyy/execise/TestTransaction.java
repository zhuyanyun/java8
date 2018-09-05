package com.zyy.execise;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.lang.System.setOut;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/9/4 下午5:35
 * @Vertion 1.0
 **/
public class TestTransaction {
    List<Transaction> transactions = null;

    @Before
    public void before(){
        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("mario","Milan");
        Trader alan = new Trader("alan","Cambridge");
        Trader brian = new Trader("brian","Cambridge");

        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2013, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2011, 710),
                new Transaction(mario, 2011, 700),
                new Transaction(alan, 2011, 950)
        );
    }

    /**
     * 1,找出2011年发生的所有交易，并按交易额排序（从低到高）
     * 2，交易员都在哪些不同的城市工作过？
     * 3，查找所有来自剑桥的交易员，并按姓名排序
     * 4，返回所有交易员的姓名字符串，按字母顺序排序
     * 5，有没有交易员在米兰工作的？
     * 6，打印生活在剑桥的交易员的所有交易额
     * 7，所有交易中，最高的交易额是多少
     * 8，找到交易额最小的交易
     */

    /**
     * 1,找出2011年发生的所有交易，并按交易额排序（从低到高）
     */
    @Test
    public void test1(){
        transactions.stream()
                .filter((e) -> e.getYear() == 2011)
                .sorted((e1,e2) -> Integer.compare(e1.getValue(),e2.getValue()))
                .forEach(System.out::println);
    }

    /**
     *      * 2，交易员都在哪些不同的城市工作过？
     */
    @Test
    public void test2(){
        transactions.stream()
                .map((e) -> e.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
    }

    /**
     *      * 3，查找所有来自剑桥的交易员，并按姓名排序
     */
    @Test
    public void test3(){
        transactions.stream()
                .filter((e) -> e.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .distinct()
                .sorted((e1,e2) -> e1.getName().compareTo(e2.getName()))
                .forEach(System.out::println);

    }

    /**
     *      * 4，返回所有交易员的姓名字符串，按字母顺序排序
     */
    @Test
    public void test4(){
        transactions.stream()
                .map((e) -> e.getTrader().getName())
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println("------------------");

        String str = transactions.stream()
                .map((e) -> e.getTrader().getName())
                .sorted()
                .reduce("", String::concat);
        System.out.println(str);

        System.out.println("--------------");

        transactions.stream()
                .map((e) -> e.getTrader().getName())
                .flatMap(TestTransaction::filterCharacter)
                .sorted((s1,s2) -> s1.compareToIgnoreCase(s2))
                .forEach(System.out::print);

    }

    public static Stream<String> filterCharacter(String str){
        ArrayList<String> list = new ArrayList<>();

        for(Character ch : str.toCharArray()){
            list.add(ch.toString());
        }

        return list.stream();
    }

    /**
     *      * 5，有没有交易员在米兰工作的？
     */

    @Test
    public void test5(){
        boolean b = transactions.stream()
                .anyMatch((t) -> t.getTrader().getCity().equals("Milan"));
        System.out.println(b);
    }

    /**
     *      * 6，打印生活在剑桥的交易员的所有交易额
     */
    @Test
    public void test6(){
        Optional<Integer> sum = transactions.stream()
                .filter((t) -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .reduce(Integer::sum);

        System.out.println(sum.get());
    }

    /**
     *      * 7，所有交易中，最高的交易额是多少
     */
    @Test
    public void test7(){
        Optional<Integer> max = transactions.stream()
                .map((t) -> t.getValue())
                .max(Integer::compare);
        System.out.println(max.get());
    }

    /**
     *      * 8，找到交易额最小的交易
     */
    @Test
    public void test8(){
        Optional<Transaction> opt = transactions.stream()
                .min((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()));
        System.out.println(opt.get());
    }

}
