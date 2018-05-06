package com.cmgy.javademo.mybatis;

import com.cmgy.javademo.Doamin.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class Main {
    public static void main(String[] args) throws Exception {

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));

        SqlSession sqlSession = sessionFactory.openSession();

        User user = sqlSession.selectOne("com.cmgy.javademo.mybatis.UserMapper.getUser", 1);

        System.out.println(user);
    }
}
