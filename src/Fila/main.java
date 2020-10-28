package Fila;

public class main {



    public static void main(String[] args) throws FilaVaziaException, FilaCheiaException {

        FilaSequencial<Integer> fila = new FilaSequencial<Integer>(Integer.class);
fila.remover();

        fila.incluir(Integer.parseInt("42"));
        fila.incluir(Integer.parseInt("3"));
        fila.incluir(Integer.parseInt("5"));
        fila.incluir(Integer.parseInt("7"));
        fila.incluir(Integer.parseInt("11"));
        fila.incluir(Integer.parseInt("13"));
        fila.incluir(Integer.parseInt("17"));
        fila.incluir(Integer.parseInt("21"));
        fila.incluir(Integer.parseInt("23"));
        fila.incluir(Integer.parseInt("27"));


        fila.incluir(Integer.parseInt("42"));
        fila.incluir(Integer.parseInt("3"));
        fila.incluir(Integer.parseInt("5"));
        fila.incluir(Integer.parseInt("7"));
        fila.incluir(Integer.parseInt("11"));
        fila.incluir(Integer.parseInt("13"));
        fila.incluir(Integer.parseInt("17"));
        fila.incluir(Integer.parseInt("21"));
        fila.incluir(Integer.parseInt("23"));
        fila.incluir(Integer.parseInt("27"));
		//fila.incluir(Integer.parseInt("31")); // ERRO: Fila cheia.

        fila.visualizar();

        Integer valorRemovido = fila.remover();
        System.out.println(valorRemovido);
        fila.incluir(Integer.parseInt("27"));
        fila.visualizar();

//
      //  fila.visualizar();

        /* Bora brincar removendo até ficar vazia, na velocidade mermão...
         * :) eu quero o erro

		while (!fila.estaVazia()) {
			System.out.println("Quantidade: " + fila.getQtd());
			System.out.println(fila.remover());

		}
*/
        System.out.println("Quantidade: " + fila.getQtd());
        System.out.println("Quantidade máxima: " + fila.getQtdMaxSuportada());
        System.out.println("Está vazia? " + fila.estaVazia());

        // Pra fora todo mundo! ;)
//		fila.limpar();
//		fila.visualizar();

        System.out.println("Próóóóximooo: " + fila.visualizarProximo());

    }
}


