package com.hackathon.service;

import com.hackathon.entity.User;

import java.util.List;

public interface UserService {

    public List<User> listAllUser();

    public User findByEmail(String theEmail);

    public void createUser(User theUser);

    public void updateUser(User theUser);

    public void deleteUser(String theEmail);

    public String login(String username, String password);
}
