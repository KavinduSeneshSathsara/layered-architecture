package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO {
    public boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;
    public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;
    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;
    ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;
    boolean isExists(String id) throws SQLException, ClassNotFoundException;
    String generateNewId() throws SQLException, ClassNotFoundException;
}
