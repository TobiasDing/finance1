package com.lifeng.finance.demo.interfaces;

import com.lifeng.finance.demo.models.Customer;
import com.lifeng.finance.demo.models.Item;
import com.lifeng.finance.demo.utils.DataBase.CustomerHandler;
import com.lifeng.finance.demo.utils.DataBase.ItemHandler;

import java.sql.SQLException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws SQLException {
        Item i = new Item(1, "写真", "20191012", "80*80", "张", 1f, 2f);
//        i.setAmount(2f);
        ItemHandler.add(i);

    }

    public static void createClient() throws SQLException {
        System.out.println("请输入客户名:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Customer customer = new Customer(name);
        CustomerHandler.add(customer);
        System.out.println(customer.getName());
    }
}