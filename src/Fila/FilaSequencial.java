package Fila;

public class FilaSequencial <T> implements IFila<T> {

    private int max=10;
    private T[] dados;
    private int tamanho=0;
    private int ultimo=0;
    private int primeiro=0;


    public FilaSequencial(Class<Integer> integerClass){
      //  this.dados = (T[]) java.lang.reflect.Array.newInstance(dataType, this.max);
     dados = (T[]) new Comparable[max];
   }

    public void incluir(T valor) throws FilaCheiaException {

        if (this.tamanho == this.max) {
            throw new FilaCheiaException();
        } else {
            this.dados[this.ultimo] = valor;
            ultimo = (ultimo + 1) % this.max;
            tamanho++;

        }

    }
    public T visualizarProximo() throws FilaVaziaException {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        return this.dados[primeiro];
    }

    public boolean estaVazia() {
        return (tamanho == 0);
    }

    public boolean estaCheia() {
        return (tamanho == max);
    }

    public void limpar() {
        tamanho  = 0;
        ultimo   = 0;
        primeiro = 0;

    }
    public int getQtd() {
        return tamanho;

    }
    public int getQtdMaxSuportada() {
        return this.max;
    }

    public T remover() throws FilaVaziaException {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        T e = dados[primeiro];
        primeiro = (primeiro + 1)  % this.max;
        tamanho--;
        return e;
    }
}

