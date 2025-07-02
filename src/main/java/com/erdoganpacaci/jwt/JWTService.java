package com.erdoganpacaci.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JWTService {


    public static final String SECRET_KEY="pS3zyTinV+D/MjtmD4Bt6Xhu48zcLIcVXMtsSTXqXA8=";

   public String generateToken(UserDetails userDetails) {

       return Jwts.builder()
               .setSubject(userDetails.getUsername())
               .setIssuedAt(new Date())
               .setExpiration(new Date(new Date().getTime() + 1000 * 60 * 60  ))
               .signWith(getKey(), SignatureAlgorithm.HS256)
               .compact();
   }

    public Claims getClaims(String token) {
        Claims claims=Jwts
                .parserBuilder()
                .setSigningKey(getKey())
                .build()
                .parseClaimsJws(token).getBody();
        return claims;


    }


    public <T> T exportToken(String token, Function<Claims, T> claimsTFunctions) {

        Claims claims = getClaims(token);
        return claimsTFunctions.apply(claims);

    }

    public String getUserNameByToken(String token) {

        return exportToken(token, Claims::getSubject);
    }



    public boolean isTokenValid(String token) {
        Date expiredDate=exportToken(token, Claims::getExpiration);
        return new Date().before(expiredDate);

    }


    public Key getKey() {

        byte[] keyBytes=Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
