package com.advancedJava.springjwt.demo.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthenticationResponse {

    private  String jwt;
    private String username;
    private List<GrantedAuthority> authorities;

//    public AuthenticationResponse(String jwt){
//        this.jwt=jwt;
//    }
}
