package com.service;

import com.beans.Users;
import com.dao.UsersDao;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsersService {

    private final UsersDao userDao;

    public UsersService(UsersDao userDao) {
        this.userDao = userDao;
    }

    public void registerUser(Users user) {
        userDao.saveUser(user);
    }

    public Users loginUser(String email, String password) {
        Users user = userDao.getUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public List<Users> getAllUsers() {
        return userDao.getAllUsers();
    }
}
