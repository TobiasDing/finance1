package com.lifeng.finance.demo.utils.DataBase;

import com.lifeng.finance.demo.models.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemHandler {




    public static void add(Item item) throws SQLException {
        Connection conn = DateBase.getConnection();

        String sql = "INSERT INTO item(name, date, spec, unit, amount, price, note, create_time, update_time, customer_id )" +
                "values("+"?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setString(1, item.getName());
        ptmt.setString(2, item.getDate());
        ptmt.setString(3, item.getSpec());
        ptmt.setString(4, item.getUnit());
        ptmt.setFloat(5, item.getAmount());
        ptmt.setFloat(6, item.getPrice());
        ptmt.setString(7, item.getNote());
        ptmt.setString(8, item.getCreateTime());
        ptmt.setString(9, item.getUpdateTime());
        ptmt.setInt(10, item.getCustomerId());

        ptmt.executeUpdate();


    }


    public static void update(int id, Item item) throws SQLException {
        Connection conn = DateBase.getConnection();

        String sql = "UPDATE item SET name=?, date=?, spec=?, unit=?, amount=?," +
                " price=?, note=?, update_time=? where id = ?";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setString(1, item.getName());
        ptmt.setString(2, item.getDate());
        ptmt.setString(3, item.getSpec());
        ptmt.setString(4, item.getUnit());
        ptmt.setFloat(5, item.getAmount());
        ptmt.setFloat(6, item.getPrice());
        ptmt.setString(7, item.getNote());
        ptmt.setString(8, item.getCreateTime());
        ptmt.setInt(9, id);

        ptmt.execute();
    }


    public static void delete(int id) throws SQLException {

        Connection conn = DateBase.getConnection();

        String sql = "DELETE FROM item where id = ?";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setString(1, String.valueOf(id));


        ptmt.execute();

    }


    public ResultSet query(int id) throws SQLException {
        Connection conn = DateBase.getConnection();

        String sql = "SELECT * FROM item where id = ?";

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
