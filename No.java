public class No {
    int valor;
    No esquerdo;
    No direito;

    No(int valor) {
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
    }

    // sem filhos:
    public boolean ehFolha() {
        return esquerdo == null && direito == null;
    }

    // pos ordem
    void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.esquerdo);
            posOrdem(no.direito);
            System.out.print(no.valor + " ");
        }
    }

    // pre ordem
    void preOrdem(No no){
        if (no != null){
            preOrdem(no.direito);
            preOrdem(no.esquerdo);
            System.out.println(no.valor + " ");
        }
    }

    // Percorra a árvore e imprima apenas os nós folha.
    public void imprimirFolhas(No no) {
        if (no != null) {
            if (no.ehFolha()) {
                System.out.println(no.valor);
            }
            imprimirFolhas(no.esquerdo);
            imprimirFolhas(no.direito);
        }
    }
    
}
