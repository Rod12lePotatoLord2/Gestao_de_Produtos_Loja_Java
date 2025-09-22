public class Main {
    public static void main(String[] args) {
        Eletronico eletronico = new Eletronico("ABCD", "Notebook Gamer", 2500.99, 24);
        Vestuario vestuario = new Vestuario("1234", "Camisa Polo - Engenharia de Software", 49.99, "M", "Preta");
        Alimento alimento = new Alimento("XYZW", "Snickers", 4.5, "22/12/2025");

        System.out.println("Dados do Eletrônico:");
        eletronico.mostrarDados();
        System.out.println();

        System.out.println("Dados do Vestuário:");
        vestuario.mostrarDados();
        System.out.println();

        System.out.println("Dados do Alimento:");
        alimento.mostrarDados();
    }
}