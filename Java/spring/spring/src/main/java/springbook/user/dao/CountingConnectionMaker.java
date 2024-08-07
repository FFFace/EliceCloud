package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class CountingConnectionMaker implements ConnectionMaker{

    private int count;
    private final ConnectionMaker realConnectionMaker;

    public CountingConnectionMaker(ConnectionMaker realConnectionMaker){
        this.realConnectionMaker = realConnectionMaker;
    }

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        System.out.println("[Log] Call getConnection()");
        count++;
        return realConnectionMaker.getConnection();
    }

    public int getCount() {
        return count;
    }
}
