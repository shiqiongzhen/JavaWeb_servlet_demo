package com.geek99.demo;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements UserDao {

    @Override
    public User login(String username, String password) {
        Connection connection = null;
        PreparedStatement prepareStatement = null;
        try {
            connection = JdbcUtils.getConnection();
            //3.获取statement
            String sql ="select id,username,password from UserTbl where username=? and password = ?";
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, username);
            prepareStatement.setString(2, password);
            //4.执行sql
//            prepareStatement.execute();
             ResultSet rs = prepareStatement.executeQuery();
             if(rs.next()){
                 int id = rs.getInt(1);
                 User u = new User();
                 u.setId(id);
                 u.setUsername(username);
                 u.setPassword(password);
                 return u;
             }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //5.释放资源 connection prepareStatement
            JdbcUtils.close(connection, prepareStatement, null);
        }
        return null;
    }
}
