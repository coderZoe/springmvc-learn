package com.coderzoe.controller;

import com.coderzoe.entity.Book;
import com.coderzoe.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yhs
 * @date 2020/7/9 20:58
 * @description
 */
@RestController
public class BookController {

    @Autowired
    private BookServiceImpl bookServiceImpl;

    @GetMapping("/getBooks")
    public List<Book> getBooks(){
        return bookServiceImpl.getBooks();
    }

    @PostMapping("/addBook")
    public String addBook(Book book){
        return bookServiceImpl.addBook(book)>0?"success":"fail";
    }

    @PostMapping("/updateBook")
    public String updateBook(Book book){
        return bookServiceImpl.upadteBook(book)>0?"success":"fail";
    }

    @GetMapping("/deleteBook")
    public String deleteBook(int id){
        return bookServiceImpl.deleteBook(id)>0?"success":"fail";
    }

    @PostMapping("/getBookIf")
    public List<Book> getBookIf(String name,String details){
        return bookServiceImpl.queryBookIf(name,details);
    }
}
