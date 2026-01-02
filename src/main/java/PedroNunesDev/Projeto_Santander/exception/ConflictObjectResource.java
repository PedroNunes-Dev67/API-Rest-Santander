package PedroNunesDev.Projeto_Santander.exception;

public class ConflictObjectResource extends RuntimeException{

    public ConflictObjectResource(String msg){
        super(msg);
    }
}
