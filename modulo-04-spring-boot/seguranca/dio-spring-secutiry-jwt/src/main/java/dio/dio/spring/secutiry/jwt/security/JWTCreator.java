package dio.dio.spring.secutiry.jwt.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.SignatureException;

import java.security.Key;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

public class JWTCreator {

    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String ROLES_AUTHORITIES = "authorities";

    // Cria um JWT seguro
    public static String create(String prefix, String base64Key, JWTObject jwtObject) {
        Key key = getKey(base64Key);

        String token = Jwts.builder()
                .setSubject(jwtObject.getSubject())
                .setIssuedAt(java.util.Date.from(jwtObject.getIssuedAt()))
                .setExpiration(java.util.Date.from(jwtObject.getExpiration()))
                .claim(ROLES_AUTHORITIES, checkRoles(jwtObject.getRoles()))
                .signWith(key, SignatureAlgorithm.HS512) // usa Key em vez de String
                .compact();

        return prefix + " " + token;
    }

    // Analisa o JWT
    public static JWTObject parse(String token, String prefix, String base64Key)
            throws ExpiredJwtException, UnsupportedJwtException, MalformedJwtException, SignatureException {

        if (token.startsWith(prefix + " ")) {
            token = token.substring(prefix.length() + 1); // remove prefixo
        }

        Key key = getKey(base64Key);

        Claims claims = Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();

        JWTObject object = new JWTObject();
        object.setSubject(claims.getSubject());
        object.setIssuedAt(claims.getIssuedAt().toInstant());
        object.setExpiration(claims.getExpiration().toInstant());

        List<String> roles = ((List<?>) claims.get(ROLES_AUTHORITIES))
                .stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        object.setRoles(roles);

        return object;
    }

    private static Key getKey(String key) {
        // usa direto os bytes da string sem Base64
        return Keys.hmacShaKeyFor(key.getBytes());
    }


    private static List<String> checkRoles(List<String> roles) {
        return roles.stream()
                .map(s -> "ROLE_" + s.replaceAll("^ROLE_", ""))
                .collect(Collectors.toList());
    }
}
