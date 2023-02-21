package com.nagarro.springApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.springApi.model.BookModel;

public interface BookDao extends JpaRepository<BookModel, Long> {

}
