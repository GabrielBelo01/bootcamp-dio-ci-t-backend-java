package dio.dio.spring.secutiry.jwt.security;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class JWTObject {
    private String subject;

    private Instant issuedAt;

    private Instant expiration;

    private List<String> roles;

    public void setRoles(String...roles){
        this.roles = Arrays.asList(roles);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Instant getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Instant issuedAt) {
        this.issuedAt = issuedAt;
    }

    public Instant getExpiration() {
        return expiration;
    }

    public void setExpiration(Instant expiration) {
        this.expiration = expiration;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
