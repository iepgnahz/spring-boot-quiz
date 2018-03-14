package com.example.userapi.datasource.provider;

import com.example.userapi.model.User;

import java.util.Arrays;
import java.util.List;

public class UserDataProvider {
    private List<User> users = Arrays.asList(
            new User(0, "小明", 20, "男"),
            new User(1, "小红", 19, "女"),
            new User(2, "小智", 15, "男"),
            new User(3, "小刚", 16, "男"),
            new User(4, "小霞", 15, "女")
    );

    public List<User> getUsers() {
        return users;
    }

    public User getUser(int id) {
        for (User user: users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User getUser(String name) {
        for (User user: users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public User insertUser(User user) throws Exception {
        if (user.getAge() == null || user.getName() == null || user.getGender() == null) {
            throw new Exception("Invalid User!");
        }
        int userID = users.get(users.size() - 1).getId() + 1;
        users.add(user.setId(userID));
        return user;
    }

    public User updateUser(int id, User user) throws Exception {
        if (user.getAge() == null || user.getName() == null || user.getGender() == null) {
            throw new Exception("Invalid User!");
        }

        User originalUser = getUser(id);

        if (originalUser == null) {
            throw new Exception("User not found by id: " + id);
        }

        return originalUser
                .setName(user.getName())
                .setAge(user.getAge())
                .setGender(user.getGender());
    }

    public User deleteUser(int id) throws Exception {
        User user = getUser(id);

        if (user == null) {
            throw new Exception("User not found by id: " + id);
        }

        users.remove(user);
        return user;
    }
}
