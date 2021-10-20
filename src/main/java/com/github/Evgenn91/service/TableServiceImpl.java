package com.github.Evgenn91.service;

import com.github.Evgenn91.dao.TableDao;
import com.github.Evgenn91.entity.Table;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TableServiceImpl implements TableService{

    @Autowired
    public TableDao tableDao;

    @Override
    public List<Table> findAll() {
        return null;
    }

    @Override
    public void save(Table table) {

    }

    @Override
    public Table getById(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Table user) {

    }
}
