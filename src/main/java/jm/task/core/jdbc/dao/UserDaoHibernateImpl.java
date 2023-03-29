package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    public UserDaoHibernateImpl() {

    }

    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS  Users (id SERIAL PRIMARY KEY, name VARCHAR(20),lastname VARCHAR(20),age INT)";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS Users";
    private static final String SAVE_USER = "INSERT INTO Users(name,lastname,age) VALUES (?,?,?)";
    private static final String DELETE_BY_ID = "DELETE FROM Users WHERE id = ?";
    private static final String GET_USERS = "SELECT * FROM Users";
    private static final String CLEAN_TABLE = "TRUNCATE TABLE Users";


    @Override
    public void createUsersTable() {

    }

    @Override
    public void dropUsersTable() {

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {

    }

    @Override
    public void removeUserById(long id) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void cleanUsersTable() {

    }
}
