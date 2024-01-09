package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO extends SuperBO {
    public boolean saveCustomer(Customer dto) throws SQLException, ClassNotFoundException;
    public boolean updateCustomer(Customer customerDTO) throws SQLException, ClassNotFoundException;
    boolean existCustomer(String id) throws SQLException, ClassNotFoundException;
    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;
    public String generateID() throws SQLException, ClassNotFoundException;
    public ArrayList<Customer> getAllCustomers() throws SQLException, ClassNotFoundException;
    public Customer search(String newValue) throws SQLException, ClassNotFoundException;
}
