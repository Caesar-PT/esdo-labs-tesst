package com.example.edsolabstest.service;

import java.util.List;

public interface IGeneralService<E> {
    List<E> findAll();

    E findById(Long id);

    E save(E e);

    void remove(Long id);
}
