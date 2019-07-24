package com.wzw.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.wzw.springboot.dao.mapping.BookMapper;
import com.wzw.springboot.dao.pojo.Book;
import com.wzw.springboot.domain.BookEntity;
import com.wzw.springboot.domain.ListId;
import com.wzw.springboot.domain.TestEntity;
import com.wzw.springboot.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Joker_wang
 * @Date: 2019/3/11 10:27
 * @Version 1.0.0
 */
@Controller
public class TestController {

    private static Logger logger=  LoggerFactory.getLogger(TestController.class);
    @Resource
    TestEntity testEntity;
    @Resource
    BookService bookService;


    @RequestMapping("/test")
    @ResponseBody
    public String test() {
       /* if(testEntity!=null){
            return "good game";
        }*/
        logger.info("this is {}","test");
        logger.info(".............");
        Book book = bookService.getBookById(12);
        System.out.println("........"+book);
        return "Hello Springboot!!!";
    }

/*    @RequestMapping("/test1")
    @ResponseBody
    public String test1() {
       *//* if(testEntity!=null){
            return "good game";
        }*//*
        Book book1 = new Book();
        book1.setBname("wqweqweqwe");
        book1.setDetail("666666");
        Integer result = bookService.addBook(book1);
        System.out.println("........"+result);
        return "Hello Springboot!!!";
    }*/



    @RequestMapping("/insert")
    @ResponseBody
    public String insert() {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setBname("test212313");
        bookEntity.setPirce("624234");
        System.out.println("1111adasdsasd");
        Integer integer = bookService.addBook(bookEntity);
        return integer.toString();
    }
    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable("id") Integer id) {

        Integer integer = bookService.deleteBook(id);
        return integer.toString();
    }

    @RequestMapping("/update/{id}/{name}")
    @ResponseBody
    public String update(@PathVariable("id") Integer id,@PathVariable("name") String name) {

        Integer integer = bookService.updateBook(id,name);
        return integer.toString();
    }

    @RequestMapping("/select/{id}/{name}")
    @ResponseBody
    public Book select(@PathVariable("id") Integer id,@PathVariable("name") String name) {

        List<Book> list = bookService.selectBook(id,name);
        if(list!=null&&list.size()>0){
            return list.get(0);
        }
        return null;
    }

    @RequestMapping(value = "/one", method = RequestMethod.POST)
    @ResponseBody
    public List<Book> select(@RequestBody String[] lis){

        /*List<Integer> list = new ArrayList<>();
        for(int i=54;i<58;i++){
            list.add(i);
        }*/
        int[] ints = new int[lis.length];
        System.out.println(lis.toString());
        for(int i=0;i<lis.length;i++){
            ints[i] = Integer.parseInt(lis[i]);
        }
        return bookService.selectById(ints);
        //return bookService.selectById(listId);

    }

    @RequestMapping(value = "/two", method = RequestMethod.POST)
    @ResponseBody
    public List<Book> select(@RequestBody BookEntity bookEntity){


        return bookService.selectByen(bookEntity);

    }

    @GetMapping(value = "/page/{num}/{size}")
    @ResponseBody
    public List<Book> pageHelper(@PathVariable("num") Integer num,@PathVariable("size") Integer size){
        PageInfo<Book> list= bookService.getList(num,size);
        if(list.getList()!=null){
            System.out.println(list.getList().toString());
        return list.getList();
        }
        return null;
    }
}

