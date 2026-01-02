package PedroNunesDev.Projeto_Santander.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundObject.class)
    public ResponseEntity<ExceptionModel> exceptionModelResponseEntity(NotFoundObject e){

        HttpStatus status = HttpStatus.NOT_FOUND;

        ExceptionModel exceptionModel = new ExceptionModel(Instant.now(), status.value(), e.getMessage());

        return ResponseEntity.status(status).body(exceptionModel);
    }
    @ExceptionHandler(ConflictObjectResource.class)
    public ResponseEntity<ExceptionModel> modelResponseEntity(ConflictObjectResource e){

        HttpStatus status = HttpStatus.CONFLICT;

        ExceptionModel exceptionModel = new ExceptionModel(Instant.now(), status.value(), e.getMessage());

        return ResponseEntity.status(status).body(exceptionModel);
    }
}
