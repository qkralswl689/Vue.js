package org.africalib.gallery.backend.service;

import io.jsonwebtoken.*;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtserviceImpl implements JwtService{
    private String secretKey = "qo123dfhdfh%%%dddd4ttt!!!!!!!!!!!%%dddggggggggggwwwwwwwwwwwww%%%%%%%%%%%%%%gus";
    @Override
    public String getToken(String key, Object value) {

        // 토큰 유효시간
        Date expTime = new Date();
        expTime.setTime(expTime.getTime() + 1000 * 60 * 5); // 5분

        byte[] secretByteKey = DatatypeConverter.parseBase64Binary(secretKey);
        Key signKey = new SecretKeySpec(secretByteKey, SignatureAlgorithm.HS256.getJcaName());

        Map<String, Object> headerMap = new HashMap<>();
        headerMap.put("typ" , "JWT");
        headerMap.put("alg","HS256");

        Map<String,Object> map = new HashMap<>();
        map.put(key,value);

        JwtBuilder builder = Jwts.builder().setHeader(headerMap)
                .setClaims(map)
                .setExpiration(expTime)
                .signWith(signKey, SignatureAlgorithm.HS256);

        return builder.compact();
    }
}
