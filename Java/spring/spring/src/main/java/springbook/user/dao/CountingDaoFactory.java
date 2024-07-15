package springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class CountingDaoFactory {

    public UserDao userDao(){
        UserDao userDao = new UserDao();
        userDao.setConnectionMaker(mySQLConnection());
        return userDao;
    }

    public ConnectionMaker connectionMaker(){
        return new CountingConnectionMaker(mySQLConnection());
    }

    public ConnectionMaker mySQLConnection(){
        return new MySQLConnection();
    }
}
