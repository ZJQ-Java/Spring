package com.qiu.dao;

import com.qiu.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        Object[] args = {book.getId(), book.getName(), book.getStatus()};
        String sql = "insert into book values(?,?,?)";
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void retrieveAll() {
//        Object[] args = {book.getId(), book.getName(), book.getStatus()};
        String sql = "select * from book";
        List<Book> update = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
        System.out.println(update);
    }

    @Override
    public void retrieveSingle(Book book) {
//        Object[] args = {book.getId(), book.getName(), book.getStatus()};
        String sql = "SELECT * from book where id=?";
        Book update = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), book.getId());
        System.out.println(update);
    }

    @Override
    public void batchSet(List<Object[]> args) {
        String sql = "insert into book (id,name,status) values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, args);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    @Override
    public void batchDel(List<Object[]> ids) {
        String sql = "delete from book where id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, ids);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public void update (Book book){
        Object[] args = {book.getStatus(),book.getId()};
        String sql = "update book set status=? where id=?";
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);

    }
}
