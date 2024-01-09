package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.entity.OrderDetail;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface PlaceOrderBO extends SuperBO {
    public boolean PlaceOrder(String orderId, LocalDate Date, String customerId, List<OrderDetail> orderDetails) throws SQLException, ClassNotFoundException;
    public String generateNewOrderId() throws SQLException, ClassNotFoundException;
    public boolean isExistsOrder(String orderId) throws SQLException, ClassNotFoundException;
    public boolean saveOrder(String orderID, LocalDate orderDate,String customerID) throws SQLException, ClassNotFoundException;
}
