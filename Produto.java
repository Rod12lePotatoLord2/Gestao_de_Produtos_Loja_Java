public class Produto {
    private String codigo;
    private String nome;
    private double preco;

    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }

    public void mostrarDados(double desconto) {
        double precoComDesconto = preco - (preco * desconto / 100);
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço com desconto: R$ " + precoComDesconto);
    }
}