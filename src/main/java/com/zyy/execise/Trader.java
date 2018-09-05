package com.zyy.execise;

import lombok.Data;

import java.util.Objects;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/9/4 下午5:27
 * @Vertion 1.0
 **/
@Data
public class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }


}
