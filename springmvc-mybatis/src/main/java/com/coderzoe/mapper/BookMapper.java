package com.coderzoe.mapper;

import com.coderzoe.entity.Book;

import java.util.List;

/**
 * @author yhs
 * @date 2020/7/9 19:35
 * @description
 */

public interface BookMapper {
    int addBook(Book book);
    int deleteBook(int id);
    int updateBook(Book book);
    List<Book> queryBook();
    Book queryById(int id);
}
