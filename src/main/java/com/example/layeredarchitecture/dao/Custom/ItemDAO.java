package com.example.layeredarchitecture.dao.Custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.entity.Item;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;

public interface ItemDAO extends CrudDAO<Item> {
    public ItemDTO findItem(String newItemCode) throws SQLException, ClassNotFoundException;

}
