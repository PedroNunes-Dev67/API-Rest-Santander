package PedroNunesDev.Projeto_Santander.exception;

import java.time.Instant;

public class ExceptionModel {

    private Instant moment;
    private Integer status;
    private String message;

    public ExceptionModel() {
    }

    public ExceptionModel(Instant moment, Integer status, String message) {
        this.moment = moment;
        this.status = status;
        this.message = message;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
