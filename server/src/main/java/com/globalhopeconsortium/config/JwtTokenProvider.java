package com.globalhopeconsortium.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtTokenProvider {

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.expiration}")
    private int jwtExpiration;

    // Helper method to return the signing key for JWT
    private SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(jwtSecret.getBytes());
    }

    // Generate a JWT token for the given authentication object
    public String generateToken(Authentication authentication) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + jwtExpiration);

        return Jwts.builder()
            .setSubject(authentication.getName())  // The user's username as the token subject
            .setIssuedAt(now)  // Current timestamp
            .setExpiration(expiryDate)  // Expiration timestamp
            .signWith(getSigningKey())  // Sign with the secret key
            .compact();
    }

    // Extract the username (subject) from the JWT token
    public String getUsernameFromToken(String token) {
        Claims claims = Jwts.parserBuilder()
            .setSigningKey(getSigningKey())  // Use the signing key to parse the token
            .build()
            .parseClaimsJws(token)
            .getBody();

        return claims.getSubject();  // Return the username (subject)
    }

    // Validate the provided JWT token
    public boolean validateToken(String token) {
        try {
            // If the token can be parsed without exception, it is valid
            Jwts.parserBuilder().setSigningKey(getSigningKey()).build().parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            // If parsing or validation fails, log the error and return false
            System.out.println("JWT validation error: " + e.getMessage());
            return false;
        }
    }
}