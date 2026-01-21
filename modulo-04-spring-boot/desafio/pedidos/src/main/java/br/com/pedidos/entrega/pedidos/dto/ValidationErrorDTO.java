package br.com.pedidos.entrega.pedidos.dto;

import java.time.LocalDateTime;
import java.util.Map;

public class ValidationErrorDTO {

    private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
    private Map<String, String> fields;

    public ValidationErrorDTO(Integer status, String error, String message, String path, Map<String, String> fields) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
        this.fields = fields;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }

    public Map<String, String> getFields() {
        return fields;
    }
}
