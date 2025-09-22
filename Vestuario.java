public class Vestuario extends Produto {
    private String tamanho;
    private String cor;

    public Vestuario(String codigo, String nome, double preco, String tamanho, String cor) {
        super(codigo, nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void mostrarDados() {
        super.mostrarDados(); // Exibe os dados da superclasse
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
    }
}