package dbService.dao;

import dbService.executor.Executor;

import java.sql.Connection;
import java.sql.SQLException;

public class UsersDAO {
    private Executor executor;

    public UsersDAO(Connection connection) {
        this.executor = new Executor(connection);
    }

    public boolean checkExistsUser(String login) throws SQLException {
        return executor.execQuery("select * from users where login='" + login + "'", result -> {
            boolean isExist = result.next();
            return isExist;
        });
    }

    public void insertUser(String login, String password) throws SQLException {
        executor.execUpdate("insert into users (login, password) values ('" + login + "', '" + password + "')");
    }

    public void createTable() throws SQLException {
        executor.execUpdate("create table if not exists users (id bigint auto_increment, login varchar(256), password varchar(256), primary key (id))");
    }

    public void dropTable() throws SQLException {
        executor.execUpdate("drop table users");
    }
}