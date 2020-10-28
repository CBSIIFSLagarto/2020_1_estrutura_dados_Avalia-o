package Fila;

public class FilaVaziaException extends Exception {

    private static final long serialVersionUID = 1L;

    public FilaVaziaException() {
        super("\n\n\n\tA fila está vazia!\n\n");
    }
}
