class ArvoreBinaria {
    public No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public int profundidade(No no, int valor) {
        return profundidadeAux(no, valor, 0);
    }

    public int profundidadeAux(No no, int valor, int nivel) {
        if (no == null) return -1;
        if (no.valor == valor) return nivel;

        int esquerda = profundidadeAux(no.esquerdo, valor, nivel + 1);
        if (esquerda != -1) return esquerda;

        return profundidadeAux(no.direito, valor, nivel + 1);
    }


    void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            preOrdem(no.esquerdo);
            preOrdem(no.direito);
        }
    }

    void posOrdem(No no){
        if(no != null){
            System.out.println(no.valor + " ");
            posOrdem(no.direito);
            posOrdem(no.esquerdo);
        }
    }

    void imprimirFolhas(No no) {
        if (no != null) {
            if (no.ehFolha()) {
                System.out.print(no.valor + " ");
            }
            imprimirFolhas(no.esquerdo);
            imprimirFolhas(no.direito);
        }
    }

    
}