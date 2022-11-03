package com.advancedJava.springjwt.demo.service;

import com.advancedJava.springjwt.demo.dto.MyUserDetails;
import com.advancedJava.springjwt.demo.entity.User;
import com.advancedJava.springjwt.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public MyUserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        return new User("foo","pass",new ArrayList<>());
        User user =this.userRepository.findByUsername(userName);
        MyUserDetails myUserDetails = new MyUserDetails(user);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(myUserDetails);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(user);

        return myUserDetails;

    }
}
