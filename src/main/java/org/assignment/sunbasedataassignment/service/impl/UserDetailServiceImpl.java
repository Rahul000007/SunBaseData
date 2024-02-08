package org.assignment.sunbasedataassignment.service.impl;

import org.assignment.sunbasedataassignment.model.User;
import org.assignment.sunbasedataassignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = this.userRepository.findUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Could not found user");
        }
        return new UserDetailsImpl(user);
    }
}
