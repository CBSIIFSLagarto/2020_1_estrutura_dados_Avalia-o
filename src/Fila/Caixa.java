package Fila;

public class Caixa {

    private   int     valor;
    private   Caixa   proximo;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public void setProximo(Caixa proximo) {
        this.proximo = proximo;
    }

    public Caixa getProximo() {
        return this.proximo;
    }

}
