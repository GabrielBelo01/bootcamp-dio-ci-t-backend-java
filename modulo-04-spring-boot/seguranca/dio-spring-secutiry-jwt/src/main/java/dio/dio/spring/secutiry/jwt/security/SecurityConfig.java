package dio.dio.spring.secutiry.jwt.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "security.config") // vai buscar no application.properties ou application.yml
public class SecurityConfig {

    private String prefix;     // ex: "Bearer"
    private String key;        // chave secreta do JWT
    private Long expiration;   // tempo de expiração em ms

    // getters e setters
    public String getPrefix() { return prefix; }
    public void setPrefix(String prefix) { this.prefix = prefix; }

    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }

    public Long getExpiration() { return expiration; }
    public void setExpiration(Long expiration) { this.expiration = expiration; }
}
