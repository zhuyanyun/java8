package com.zyy.time;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

/**
 * Created by zyy on 18/9/9.
 */
public class TestNewDateAPI {

    //ZonedDate,ZonedTime, ZonedDateTime
    @Test
    public void test8(){
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Aden"));
        System.out.println(now);

        LocalDateTime now2 = LocalDateTime.now();
        ZonedDateTime zdt = now2.atZone(ZoneId.of("Asia/Aden"));
        System.out.println(zdt);
    }

    @Test
    public void test7(){
        Set<String> set = ZoneId.getAvailableZoneIds();
        set.forEach(System.out::println);
    }


    //DateTimeFormatter: 格式化时间/日期
    @Test
    public void test6(){
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDateTime now = LocalDateTime.now();

        String strDate = now.format(formatter);
        System.out.println(strDate);

        System.out.println("--------------------------");

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String str = formatter2.format(now);
        System.out.println(str);

        LocalDateTime newDate = now.parse(str, formatter2);
        System.out.println(newDate);


    }


    //TemporalAdjuster : 时间校正器
    @Test
    public void test5(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime now2 = now.withDayOfMonth(10);
        System.out.println(now2);

        LocalDateTime time = now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(time);

        //自定义: 下一个工作日
        LocalDateTime n5 = now.with((n) -> {
            LocalDateTime n2 = (LocalDateTime) n;

            DayOfWeek dow = n2.getDayOfWeek();

            if (dow.equals(DayOfWeek.FRIDAY)) {
                return n2.plusDays(3);
            } else if (dow.equals(DayOfWeek.SATURDAY)) {
                return n2.plusDays(2);
            } else {
                return n2.plusDays(1);
            }
        });

        System.out.println(n5);
    }
}