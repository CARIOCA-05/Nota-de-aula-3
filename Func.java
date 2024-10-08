import java.time.LocalDate;
import java.time.Period;


class Funcionario {
    protected String nome;
    protected LocalDate nasc;
    protected double salario;

    public Funcionario(String nome, LocalDate nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public void informarSalario() {
        System.out.println("Salário: R$ " + salario);
    }

    public void calcularIdade() {
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(nasc, hoje);
        System.out.println("Idade: " + idade.getYears() + " anos");
    }
}