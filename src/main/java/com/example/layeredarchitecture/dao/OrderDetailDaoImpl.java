package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDetailDaoImpl implements OrderDetailDAO {
   @Override
    public boolean saveOrderDetail(String orderId, OrderDetailDTO orderDetailDTO) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)");
        pstm.setString(1,orderId);
        pstm.setString(2, orderDetailDTO.getItemCode());
        pstm.setBigDecimal(3, orderDetailDTO.getUnitPrice());
        pstm.setInt(4, orderDetailDTO.getQty());

        return pstm.executeUpdate() > 0;
    }
}
