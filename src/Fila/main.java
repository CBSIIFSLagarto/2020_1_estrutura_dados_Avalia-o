package Fila;
public class main {



    public static void main(String[] args) throws FilaVaziaException, FilaCheiaException {

        FilaInteiros fila;
        fila = new FilaInteiros();

        fila.incluir(1);
        fila.incluir(2);
        fila.incluir(3);
        fila.incluir(4);
        fila.incluir(5);
        fila.incluir(6);
        fila.incluir(7);
        fila.incluir(8);
        fila.incluir(9);
        fila.incluir(10);
        System.out.println(fila.visualizarProximo());
        fila.remover();
        fila.remover();
        System.out.println(fila.visualizarProximo());
        fila.incluir(6);
        System.out.println(fila.visualizarProximo());

    }
}


