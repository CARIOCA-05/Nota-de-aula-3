import java.time.LocalDate;

class Gerente extends Funcionario {
    private String projeto;

    public Gerente(String nome, LocalDate nasc, double salario, String projeto) {
        super(nome, nasc, salario);
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.println("Projeto gerenciado atualmente é: " + projeto);
    }
}
