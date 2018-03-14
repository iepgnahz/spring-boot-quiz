package com.example.userapi.model;

import java.util.HashMap;
import java.util.Map;

public class User {
    private int id;
    private String name;
    private Integer age;
    private String gender;

    public User() { }

    public User(int id, String name, Integer age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public User setGender(String gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public String toString() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", this.id);
        map.put("name", this.name);
        map.put("age", this.age);
        map.put("gender", this.gender);
        return map.toString();
    }
}
