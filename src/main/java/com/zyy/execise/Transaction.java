package com.zyy.execise;

import lombok.Data;
import lombok.Getter;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/9/4 下午5:26
 * @Vertion 1.0
 **/
@Data
public class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
}
