package com.example.service;


import com.example.AppConfig;
import com.example.entity.Book;
import com.example.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BookServiceTest {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    public void testBookService() {
        BookService bean = applicationContext.getBean(BookService.class);
        Book book = new Book();
        book.setId(2);
        book.setName("book");
        book.setStatus(2);
//        bean.add(book);
        bean.retrieveAll();
//        bean.retrieveSingle(book);
    }

    @Test
    public void testBatchBookService() {
        BookService bean = applicationContext.getBean(BookService.class);
        Object[] arg1 = {3,"book3",1};
        Object[] arg2 = {4,"book4",1};
        Object[] arg3 = {5,"book5",1};

        Object[] del1 = {5};
        Object[] del2 = {4};
//        List<Object[]> list = Arrays.asList(arg1,arg2,arg3);
//        bean.batchSetOperate(list);
        bean.batchDelOperate(Arrays.asList(del1,del2));
    }
}
