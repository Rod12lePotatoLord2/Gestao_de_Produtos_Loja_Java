import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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

    public void mostrarDados(int diasProximos) {
        super.mostrarDados();
        System.out.println("Data de Validade: " + dataValidade);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataValidadeLocal = LocalDate.parse(dataValidade, formatter);
        long diasRestantes = ChronoUnit.DAYS.between(LocalDate.now(), dataValidadeLocal);

        if (diasRestantes <= diasProximos) {
            System.out.println("Aviso: Este produto está perto da validade! Faltam " + diasRestantes + " dias.");
        }
    }
}