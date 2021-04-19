package com.lifeng.finance.demo.models;
import com.lifeng.finance.demo.utils.Time;

public class Customer extends Model{
    int id;
    String name;
    String createTime;
    String updateTime;

    public Customer(String name) {
        this.name = name;
        createTime = Time.getCurrentTime();
        updateTime = Time.getCurrentTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        updateTime = getCreateTime();
    }

    public String getCreateTime() {
        return createTime;
    }


    public String getUpdateTime() {
        return updateTime;
    }


}
