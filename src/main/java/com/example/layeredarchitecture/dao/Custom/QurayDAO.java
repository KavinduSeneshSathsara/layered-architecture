package com.example.layeredarchitecture.dao.Custom;

import com.example.layeredarchitecture.dto.CustomerOrderDetailsDTO;

import java.sql.SQLException;
import java.util.List;

public interface QurayDAO {
    List<CustomerOrderDetailsDTO> customerOrderDetails() throws SQLException, ClassNotFoundException;
}
