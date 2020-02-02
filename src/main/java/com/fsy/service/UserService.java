package com.fsy.service;

import com.fsy.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
