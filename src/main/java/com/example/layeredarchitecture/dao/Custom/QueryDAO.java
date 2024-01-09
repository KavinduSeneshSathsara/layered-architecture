package com.example.layeredarchitecture.dao.Custom;

import com.example.layeredarchitecture.dao.SuperDAO;
import com.example.layeredarchitecture.entity.Search;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO extends SuperDAO {
    public ArrayList<Search> getOrderDetail() throws SQLException, ClassNotFoundException;

}
