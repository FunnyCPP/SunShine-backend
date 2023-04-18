package com.example.demo.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParserBuilder;
import io.jsonwebtoken.Jwts;

public class JwtService {

    public String extractUsername(String token) {
        return null;
    }

    private Claims extractAllClaims(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(getSigningKey)
                .build()
                .parseClaimsJws(token)
                .getBody();

    }



}
