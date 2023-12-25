package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dto.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO {
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;
    boolean deleteItem(String code) throws SQLException, ClassNotFoundException;
    boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    boolean isExists(String code) throws SQLException, ClassNotFoundException;
    String generateNewId() throws SQLException, ClassNotFoundException;
    boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
}
