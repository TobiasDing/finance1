package com.lifeng.finance.demo.models;

import com.lifeng.finance.demo.utils.Time;

public class Item extends Model {

    int id;
    int customerId;
    String name;
    String spec;
    String unit;
    String date;
    float amount;
    float price;
    String note;
    String contact;
    String createTime;
    String updateTime;

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }



    public Item(int customerId, String name, String date, String spec, String unit, float amount, float price) {
        this.customerId = customerId;
        this.date = date;
        this.name = name;
        this.spec = spec;
        this.unit = unit;
        this.amount = amount;
        this.price = price;
        createTime = Time.getCurrentTime();
        updateTime = Time.getCurrentTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.updateTime = getCreateTime();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
        this.updateTime = getCreateTime();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
        this.updateTime = getCreateTime();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
        this.updateTime = getCreateTime();
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
        this.updateTime = getCreateTime();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        this.updateTime = getCreateTime();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
        this.updateTime = getCreateTime();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
        this.updateTime = getCreateTime();
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

}
