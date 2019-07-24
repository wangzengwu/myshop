package com.wzw.springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzw.springboot.dao.mapping.BookMapper;
import com.wzw.springboot.dao.pojo.Book;
import com.wzw.springboot.domain.BookEntity;
import com.wzw.springboot.domain.ListId;
import com.wzw.springboot.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Joker_wang
 * @Date: 2019/3/11 17:51
 * @Version 1.0.0
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper bookMapper;

    @Override
    public Book getBookById(Integer bid) {

        Book book = bookMapper.selectByPrimaryKey(bid);
        if(book!=null){
            System.out.println("dasdasd");
            return book;
        }
        System.out.println("1111");
        return null;
    }

    @Override
    public Integer addBook(BookEntity book) {
        //int result = bookMapper.insert(book);
        Integer result = bookMapper.insert1(book);
        return result;
    }

    @Override
    public Integer deleteBook(Integer id) {
        int result = bookMapper.deleteById(id);
        return result;
    }

    @Override
    public Integer updateBook(Integer id, String name) {
        Integer result=bookMapper.updateBook(id,name);
        return result;
    }

    @Override
    public List<Book> selectBook(Integer id, String name) {
        List<Book>list=bookMapper.selectByIdOrName(id,name);
        return list;
    }

    @Override
    public List<Book> selectById(int[] listId) {
        List<Book> list=bookMapper.selectByIdList(listId);
        if(list!=null&&list.size()>0){
            return list;
        }
        return null;
    }

    @Override
    public List<Book> selectByen(BookEntity bookEntity) {
        List<Book> list=bookMapper.selectByEn(bookEntity);
        return list;
    }

    @Override
    public PageInfo<Book> getList(Integer num, Integer size) {
        PageHelper.startPage(num,size);
        List<Book> books = bookMapper.selectAll();
        return new PageInfo<Book>(books);
    }
}
