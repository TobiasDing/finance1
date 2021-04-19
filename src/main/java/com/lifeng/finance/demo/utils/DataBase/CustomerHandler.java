package com.lifeng.finance.demo.utils.DataBase;

import com.lifeng.finance.demo.models.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerHandler{




    public static void add(Customer customer) throws SQLException {
        Connection conn = DateBase.getConnection();

        String sql = "INSERT INTO customer(name, create_time, update_time)" +
                "values("+"?,?,?)";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setString(1, customer.getName());
        ptmt.setString(2, customer.getCreateTime());
        ptmt.setString(3, customer.getUpdateTime());

        ptmt.executeUpdate();


    }


    public static void update(int id, Customer customer) throws SQLException {
        Connection conn = DateBase.getConnection();

        String sql = "UPDATE customer SET name=?, update_time=? where id = ?";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setString(1, customer.getName());
        ptmt.setString(2, customer.getUpdateTime());
        ptmt.setString(3, String.valueOf(id));

        ptmt.execute();
    }


    public static void delete(int id) throws SQLException {

        Connection conn = DateBase.getConnection();

        String sql = "DELETE FROM customer where id = ?";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setString(1, String.valueOf(id));


        ptmt.execute();

    }


    public ResultSet query(int id) throws SQLException {
        Connection conn = DateBase.getConnection();

        String sql = "SELECT * FROM customer where id = ?";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setString(1, String.valueOf(id));


        ResultSet rs = ptmt.executeQuery();

        return rs;
    }


//    public void main(String[] args) throws SQLException {
//        Customer c = new Customer("lifeng");
//        this.addCustomer(c);
//    }
}
