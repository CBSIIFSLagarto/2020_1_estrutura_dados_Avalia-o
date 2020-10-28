package Fila;
public class FilaCheiaException extends Exception {


    private static final long serialVersionUID = 1L;

    public FilaCheiaException() {
        super("\n\n\n\tA fila está cheia!\n\n");
    }
}