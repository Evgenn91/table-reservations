package com.github.Evgenn91.dao;

import com.github.Evgenn91.entity.Table;

import java.util.List;

public interface TableDao {
    void save(Table table);

    Table getById(int id);

    void delete(int id);

    void update(Table user);

    List<Table> findAll();
}
