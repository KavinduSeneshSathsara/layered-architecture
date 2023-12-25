package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.Custom.ItemDAO;
import com.example.layeredarchitecture.dao.Custom.impl.ItemDAOImpl;
import com.example.layeredarchitecture.dto.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO{

    ItemDAO itemDAO = new ItemDAOImpl();
    @Override
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }

    @Override
    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.delete(code);
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
        return itemDAO.update(itemDTO);
    }

    @Override
    public boolean isExists(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.isExists(code);
    }

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {
        return itemDAO.generateNewId();
    }

    @Override
    public boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
        return itemDAO.save(itemDTO);
    }
}
