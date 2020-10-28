package Fila;

public class main2 {

        public static void main(String[] args) throws FilaVaziaException {
            FilaInteirosInfinita filaInteirosInfinita = new FilaInteirosInfinita();
            System.out.println("Vazia? : "+filaInteirosInfinita.estaVazia());

            filaInteirosInfinita.incluir(Integer.parseInt("1"));
            filaInteirosInfinita.incluir(Integer.parseInt("2"));
            filaInteirosInfinita.incluir(Integer.parseInt("3"));
            filaInteirosInfinita.incluir(Integer.parseInt("4"));
            filaInteirosInfinita.incluir(Integer.parseInt("5"));
            filaInteirosInfinita.incluir(Integer.parseInt("6"));
            filaInteirosInfinita.incluir(Integer.parseInt("7"));
            filaInteirosInfinita.incluir(Integer.parseInt("8"));
            filaInteirosInfinita.incluir(Integer.parseInt("9"));
            filaInteirosInfinita.incluir(Integer.parseInt("10"));
            filaInteirosInfinita.incluir(Integer.parseInt("11"));
            filaInteirosInfinita.incluir(Integer.parseInt("12"));
            filaInteirosInfinita.getQtd();
            filaInteirosInfinita.visualizar();

            System.out.println("Quantidade máxima: " + filaInteirosInfinita.getQtdMaxSuportada());
          //  System.out.println("visualizar proximo: "+filaInteirosInfinita.visualizarProximo());


        }
    }

