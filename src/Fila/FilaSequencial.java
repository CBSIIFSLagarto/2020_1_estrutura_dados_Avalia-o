package Fila;

import java.util.stream.Stream;

public class FilaSequencial<T> implements IFila<T> {
    private int max;
    private int inicio;
    private int fim;
    private T[] dados;

    public FilaSequencial(Class<T> dataType) {
        this.max = 10;
        this.dados = (T[]) java.lang.reflect.Array.newInstance(dataType, this.max);
        this.inicio = -1;
        this.fim = -1;
    }

    public void incluir(T valor) throws FilaCheiaException {
        if (this.fim + 1 == this.max) {
            throw new FilaCheiaException();
        }

        this.dados[++this.fim] = valor;
    }





    public T remover() throws FilaVaziaException {

        if (estaVazia()) {
            throw new FilaVaziaException();// Se vazia lança um erro.
        }

        T dadoRemovido = this.dados[0];// salvando o retorno, que será o valor removido.

        int indice;
        for (indice = 0; indice < this.fim; indice++) {
            this.dados[indice] = this.dados[indice + 1]; // deslocanto todas posições.
        }

        this.dados[indice] = null;// limpando a posicão.
        this.fim--;

        return dadoRemovido;

    }

    public int getQtd() {
        return this.fim + 1; //@return A quantidade de valores na fila.
    }


    @Override
    public int getQtdMaxSuportada() {
        return this.max;      //@return A quantidade máxima de valores na fila.

    }

    public boolean estaVazia() {
        return this.fim == -1; //@return  true se verdadeiro, false caso contrário.
    }

    public void limpar() {
        for (int indice = 0; indice < this.getQtd(); indice++) {
            this.dados[indice] = null; // removendo todos os elementos, atribuindo null.
        }

        this.fim = -1; //this.fim = -1 para deixar tudo como era no ínicio.
    }

    public T visualizarProximo() throws FilaVaziaException {
        return this.dados[++this.inicio]; // @return o próximo da fila.
    }

    public void visualizar() { // Visualiza todos os valores que pertencem a fila, para testes pessoais não era necessário.
        Stream.of(this.dados)
                .forEach(dado -> System.out.print(dado + " -> "));
        // this.fim + 1 pois o fim começa em -1 :( humanos começam a contar de 1
        System.out.println("... " + (this.fim + 1) + " valores na fila");
    }

    public int getMax() {
        return max;
    }


    public void setMax(int max) {
        this.max = max;
    }

    public int getInicio() {
        return inicio;
    }


    public void setInicio(int inicio) {
        this.inicio = inicio;
    }


    public int getFim() {
        return fim;
    }


    public void setFim(int fim) {
        this.fim = fim;
    }


    public T[] getDados() {
        return dados;
    }


    public void setDados(T[] dados) {
        this.dados = dados;
    }

}