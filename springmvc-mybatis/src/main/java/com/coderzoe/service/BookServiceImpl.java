package com.coderzoe.service;

import com.coderzoe.entity.Book;
import com.coderzoe.mapper.BookMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yhs
 * @date 2020/7/9 19:53
 * @description
 */

@Service
public class BookServiceImpl {
    @Autowired
    private BookMapper bookMapper;
    public List<Book> getBooks() {
        return bookMapper.queryBook();
    }

    public int addBook(Book book){
        return bookMapper.addBook(book);
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int upadteBook(Book book){
        return bookMapper.updateBook(book);
    }

    public int deleteBook(int id){
        return bookMapper.deleteBook(id);
    }

    public List<Book> queryBookIf(String name, String details){
        Map<String,String> map = new HashMap<>();
        if(!"".equals(name)&&name!=null){
            map.put("name",name);
        }
        if(!"".equals(details)&&details!=null){
            map.put("details",details);
        }
        return bookMapper.queryBookIf(map);
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        BookServiceImpl bookService = context.getBean("bookServiceImpl", BookServiceImpl.class);
        List<Book> bookList = bookService.getBooks();
        System.out.println(bookList);
    }

}
