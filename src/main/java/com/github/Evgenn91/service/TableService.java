package com.github.Evgenn91.service;

import com.github.Evgenn91.entity.Table;

import java.util.List;

public interface TableService {
    List<Table> findAll();

    void save(Table table);

    Table getById(int id);

    void delete(int id);

    void update(Table user);
}
