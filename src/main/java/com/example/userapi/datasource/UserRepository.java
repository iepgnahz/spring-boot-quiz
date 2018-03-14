package com.example.userapi.datasource;

import com.example.userapi.model.User;

public interface UserRepository {
    User createUser(User user) throws Exception;
    User deleteUser(int id) throws Exception;
    User updateUser(int id, User user) throws Exception;
    User getUser(int id);
    User getUser(String name);
}
