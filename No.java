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

}
