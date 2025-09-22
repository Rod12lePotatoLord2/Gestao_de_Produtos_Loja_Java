public class Main {
    public static void main(String[] args) {
        Eletronico eletronico = new Eletronico("ABCD", "Notebook Gamer (Positivo)", 1000.00, 24);
        Vestuario vestuario = new Vestuario("1234", "Camisa Polo - Engenharia de Software", 49.99, "M", "Preta");
        Alimento alimento = new Alimento("XYZW", "Snickers", 4.50, "22/12/2025");

        System.out.println("Informações do Eletrônico:");
        eletronico.mostrarDados(true);
        System.out.println();

        System.out.println("Informações de Vestuário:");
        vestuario.mostrarDados(true);
        System.out.println();

        System.out.println("Informações do Alimento:");
        alimento.mostrarDados(30);
        System.out.println();

        System.out.println("Informação sobre o Produto com Desconto:");
        eletronico.mostrarDados(10);
    }
}