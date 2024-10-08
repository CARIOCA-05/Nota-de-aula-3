import java.time.LocalDate;

class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, LocalDate nasc, double salario, String linguagem) {
        super(nome, nasc, salario);
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.println("Linguagem de programação: " + linguagem);
    }
}
