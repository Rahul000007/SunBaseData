package org.assignment.sunbasedataassignment.service.impl;

import org.assignment.sunbasedataassignment.model.User;
import org.assignment.sunbasedataassignment.repository.UserRepository;
import org.assignment.sunbasedataassignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
