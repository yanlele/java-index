package com.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Entry {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Book book = (Book) ctx.getBean("book");
        System.out.println(book.getName());
    }
}
