package com.cmgy.javademo.jdbc;

public class Main {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
//        userDao.insertWithName("chenhao1");

        for (int i=2;i<10;i++) {
            userDao.insertWithName("chenhao" + i);
        }
    }
}
