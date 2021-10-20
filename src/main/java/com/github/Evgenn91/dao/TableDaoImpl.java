package com.github.Evgenn91.dao;

import com.github.Evgenn91.entity.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TableDaoImpl implements TableDao{
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public TableDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
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

    @Override
    public List<Table> findAll() {
        return null;
    }
}
