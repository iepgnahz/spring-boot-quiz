package com.example.userapi.datasource;

import com.example.userapi.datasource.provider.UserDataProvider;
import com.example.userapi.model.User;
import org.springframework.stereotype.Component;

@Component
public class TestUserRepository implements UserRepository {
    private UserDataProvider userDataProvider = new UserDataProvider();

    @Override
    public User createUser(User user) throws Exception {
        return userDataProvider.insertUser(user);
    }

    @Override
    public User deleteUser(int id) throws Exception {
        return userDataProvider.deleteUser(id);
    }

    @Override
    public User updateUser(int id, User user) throws Exception {
        return userDataProvider.updateUser(id, user);
    }

    @Override
    public User getUser(String name) {
        return userDataProvider.getUser(name);
    }

    @Override
    public User getUser(int id) {
        return userDataProvider.getUser(id);
    }
}
