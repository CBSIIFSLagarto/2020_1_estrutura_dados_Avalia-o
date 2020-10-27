package Fila;

public class FilaInteirosInfinita {

    private Caixa inicio;
    private int qtd=0;

    public FilaInteirosInfinita() {
        this.inicio = null;
    }

    //==============================================================

    public void incluir(int valor) {
        Caixa nova = new Caixa();
        nova.setValor(valor);
        nova.setProximo(null);
        qtd++;
        if (inicio == null) {
            inicio = nova;
        } else {
            Caixa aux;
            aux = inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }
    }

    //==============================================================

    public int remover() throws FilaVaziaException {
        if (inicio != null) {
            Caixa aux = inicio;
            int valor = aux.getValor();
            inicio = aux.getProximo();
            qtd--;
            return valor;
        } else {
            throw new FilaVaziaException();
        }
    }

    //==============================================================

    public int getQtd(){
        return qtd;
    }

    //==============================================================

    public int visualizarProximo() throws FilaVaziaException {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }else{
            Caixa aux = inicio;
            return aux.getValor();
        }
    }

    //==============================================================

    public void limpar(){
        this.inicio = null;
        qtd=0;
    }

    //==============================================================

    public boolean estaVazia() {
        return this.inicio == null;
    }

    //==============================================================

}
