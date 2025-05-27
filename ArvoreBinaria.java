class ArvoreBinaria {
    No raiz;

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