package Fila;

public class FilaInteiros extends FilaSequencial<Integer>{
    public FilaInteiros() {
        super(Integer.class);
    }
}




        /*
        public class FilaInteiros {

        private int elementos[];
        private int primeiro;
        private int ultimo;
        private int total;

        public FilaInteiros() {
            elementos = new int[10];
            total = 0;
            primeiro = 0;
            ultimo = 0;
        }

        public void incluir(int valor) throws FilaCheiaException {
            if (estaCheia()) {
                throw new FilaCheiaException();
            }
            this.elementos[ultimo] = valor;
            ultimo = (ultimo + 1) % elementos.length;
            total++;
        }

        public int remover() throws FilaVaziaException {
            if (estaVazia()) {
                throw new FilaVaziaException();
            }
            int e = elementos[primeiro];
            primeiro = (primeiro + 1) % elementos.length;
            total--;
            return e;
        }

        public int getQtd() {
            return total;

        }
        public int getQtdMaxSuportada() {
            return elementos.length;
         }

        public boolean estaVazia() {
            return (total == 0);
        }

        public boolean estaCheia() {
            return (total == elementos.length);
        }

        public void limpar() {
            total     = 0;
            primeiro  = 0;
            ultimo    = 0;

        }
        public int visualizarProximo() throws FilaVaziaException {
            if (estaVazia()) {
                throw new FilaVaziaException();
            }
            return elementos[primeiro];
        }

    }*/
