public class Alimento extends Produto {
    private String dataValidade;

    public Alimento(String codigo, String nome, double preco, String dataValidade) {
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Data de Validade: " + dataValidade);
    }
}