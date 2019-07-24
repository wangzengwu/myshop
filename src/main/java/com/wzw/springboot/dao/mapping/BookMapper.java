package com.wzw.springboot.dao.mapping;

import com.wzw.springboot.dao.pojo.Book;
import com.wzw.springboot.domain.BookEntity;
import com.wzw.springboot.domain.ListId;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BookMapper extends Mapper<Book> {
    Integer insert1(@Param("book") BookEntity book);

    int deleteById(Integer id);

    Integer updateBook(@Param("id")Integer id, @Param("name") String name);

    List<Book> selectByIdOrName(@Param("id") Integer id, @Param("name") String name);

    List<Book> selectByIdList(@Param("listId") int[] listId);

    List<Book> selectByEn(@Param("bookEntity")BookEntity bookEntity);
}