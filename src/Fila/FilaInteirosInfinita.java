package Fila;
public class FilaInteirosInfinita extends FilaSequencial<Integer> {
    private Integer[] dados;

    public FilaInteirosInfinita() {
        super(Integer.class);
        this.dados = (Integer[]) java.lang.reflect.Array.newInstance(Integer.class, this.getMax());
    }

    @Override
    public void incluir(Integer valor) {
        if (this.getQtd() == this.getQtdMaxSuportada()) { // Vetor em sua capacidade máxima?
            this.aumentarCapacidade(); // método que dobra a quantidade do vetor.
        }

        this.setFim(this.getFim() + 1); // incremento
        this.dados[this.getFim()] = valor;

    }

    @Override
    public Integer remover() throws FilaVaziaException{

        if (estaVazia()) {
            throw new FilaVaziaException();
        }

        Integer dadoRemovido = this.dados[0];

        int indice;
        for (indice = 0; indice < this.getFim(); indice++) {
            this.dados[indice] = this.dados[indice + 1];
        }

        this.dados[indice] = null;
        this.setFim(this.getFim() - 1);

        return dadoRemovido;
    }

    // Estamos aumentando a capacidade da fila 2x.
    private void aumentarCapacidade() {
        this.setMax(this.getMax() * 2);
        Integer[] temporario = (Integer[]) java.lang.reflect.Array.newInstance(Integer.class, this.getMax());
        for (int indice = 0; indice <= this.getFim(); indice++) {
            temporario[indice] = this.dados[indice];
        }

        // Agora que temos um temporário com tamanho maior, o que fazemos é atribuir de novo para this.dados
        this.dados = temporario;
    }

    public Integer visualizarProximo() throws FilaVaziaException {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        return this.dados[0]; // @return o próximo da fila.
    }

    public void limpar() {
        for (int indice = 0; indice < this.getQtd(); indice++) {
            this.dados[indice] = null; // removendo todos os elementos, atribuindo null.
        }

        this.setFim(-1);
    }
}
