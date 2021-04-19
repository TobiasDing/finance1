package com.lifeng.finance.demo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public static String getCurrentTime(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = format.format(new Date());
        return currentTime;

    }

    public static void main(String[] args) {
        System.out.println(getCurrentTime());
    }
}
