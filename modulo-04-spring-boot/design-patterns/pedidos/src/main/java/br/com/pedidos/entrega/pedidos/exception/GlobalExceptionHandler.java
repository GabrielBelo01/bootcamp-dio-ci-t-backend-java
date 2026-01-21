package br.com.pedidos.entrega.pedidos.exception;

import br.com.pedidos.entrega.pedidos.dto.ApiErrorDTO;
import br.com.pedidos.entrega.pedidos.dto.ValidationErrorDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EntidadeNaoEncontradaException.class)
    public ResponseEntity<ApiErrorDTO> handleEntidadeNaoEncontrada(EntidadeNaoEncontradaException ex, HttpServletRequest request){

        HttpStatus status = HttpStatus.NOT_FOUND;

        ApiErrorDTO error = new ApiErrorDTO(
                status.value(),
                status.name(),
                ex.getMessage(),
                request.getRequestURI()
        );

        return ResponseEntity.status(status).body(error);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationErrorDTO> handleValidation(MethodArgumentNotValidException ex, HttpServletRequest request){

        HttpStatus status = HttpStatus.BAD_REQUEST;

        Map<String, String> fields = new LinkedHashMap<>();
        ex.getBindingResult().getFieldErrors()
                .forEach(err -> fields.put(err.getField(), err.getDefaultMessage()));

        ValidationErrorDTO body = new ValidationErrorDTO(
                status.value(),
                status.name(),
                "Dados invalidos",
                request.getRequestURI(),
                fields

        );

        return  ResponseEntity.status(status).body(body);
    }

    @ExceptionHandler(StatusPedidoInvalidoException.class)
    public ResponseEntity<ApiErrorDTO> handlerStatusPedidoInvalido(StatusPedidoInvalidoException ex, HttpServletRequest request){
        HttpStatus status = HttpStatus.BAD_REQUEST;

        ApiErrorDTO error = new ApiErrorDTO(
                status.value(),
                status.name(),
                ex.getMessage(),
                request.getRequestURI()
        );

        return ResponseEntity.status(status).body(error);
    }

}
