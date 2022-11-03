package com.advancedJava.springjwt.demo.controller;

import com.advancedJava.springjwt.demo.Models.AuthenticationRequest;
import com.advancedJava.springjwt.demo.Models.AuthenticationResponse;
import com.advancedJava.springjwt.demo.dto.MyUserDetails;
import com.advancedJava.springjwt.demo.entity.User;
import com.advancedJava.springjwt.demo.repository.UserRepository;
import com.advancedJava.springjwt.demo.service.MyUserDetailService;
import com.advancedJava.springjwt.demo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailService myUserDetailService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @GetMapping("/hello")
    public String Hello(){
    return "Hello world";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)throws  Exception{
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        }catch(BadCredentialsException e){
            throw new Exception("Incorrect username and password",e);
        }

        MyUserDetails myUserDetails= this.myUserDetailService.loadUserByUsername(authenticationRequest.getUsername());
        String jwt=this.jwtTokenUtil.generateToken(myUserDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt,myUserDetails.getUsername(),myUserDetails.getAuthorities()));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> saveUser(@RequestBody Map<String,Object> payload) {


        String username = (String) payload.get("username");
        String password = (String) payload.get("password");
        String roles = "";
        if (payload.get("roles") != null) {
            roles = (String) payload.get("roles");
        } else {
            roles = "ROLE_USER";
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRoles(roles);


        this.userRepository.save(user);

        return ResponseEntity.ok(user);


    }

    @GetMapping("/admin")
    public String loadAdminConsole(){
        return "Welcome Admin";
    }

    @GetMapping("/customer")
    public String loadCustomerConsole(){
        return "Welcome Customer";
    }
}