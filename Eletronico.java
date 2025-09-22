public class Eletronico extends Produto {
    private int garantia;

    public Eletronico(String codigo, String nome, double preco, int garantia) {
        super(codigo, nome, preco);
        this.garantia = garantia;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Garantia: " + garantia + " meses");
    }

    public void mostrarDados(boolean exibirEmAnos) {
        super.mostrarDados();
        if (exibirEmAnos) {
            System.out.println("Garantia: " + (garantia / 12) + " anos");
        } else {
            System.out.println("Garantia: " + garantia + " meses");
        }
    }
}