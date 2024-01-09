package com.example.layeredarchitecture.dao.Custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.entity.Order;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public interface OrderDAO extends CrudDAO<Order> {
    public String generateNewOrderId() throws SQLException, ClassNotFoundException;

    public boolean isExistsOrder(String orderId) throws SQLException, ClassNotFoundException;

    public boolean saveOrder(String orderID, LocalDate orderDate, String customerID) throws SQLException, ClassNotFoundException;

}
