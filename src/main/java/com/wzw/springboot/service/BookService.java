package com.wzw.springboot.service;

import com.github.pagehelper.PageInfo;
import com.wzw.springboot.dao.pojo.Book;
import com.wzw.springboot.domain.BookEntity;
import com.wzw.springboot.domain.ListId;

import java.util.List;

/**
 * @Author: Joker_wang
 * @Date: 2019/3/11 17:50
 * @Version 1.0.0
 */
public interface BookService {
    Book getBookById(Integer bid);
    Integer addBook(BookEntity book);

    Integer deleteBook(Integer id);

    Integer updateBook(Integer id, String name);

    List<Book> selectBook(Integer id, String name);

    List<Book> selectById(int[] listId);

    List<Book> selectByen(BookEntity bookEntity);

    PageInfo<Book> getList(Integer num, Integer size);

}
