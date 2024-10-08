import java.time.LocalDate;
import java.util.Scanner;

public class SistemaEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do gerente: ");
        String nomeGerente = scanner.nextLine();
        System.out.print("Informe a data de nascimento do gerente (AAAA-MM-DD): ");
        LocalDate nascGerente = LocalDate.parse(scanner.nextLine());
        System.out.print("Informe o salário do gerente: ");
        double salarioGerente = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Informe o projeto do gerente: ");
        String projetoGerente = scanner.nextLine();

        Gerente gerente = new Gerente(nomeGerente, nascGerente, salarioGerente, projetoGerente);

        System.out.print("\nInforme o nome do programador: ");
        String nomeProgramador = scanner.nextLine();
        System.out.print("Informe a data de nascimento do programador (AAAA-MM-DD): ");
        LocalDate nascProgramador = LocalDate.parse(scanner.nextLine());
        System.out.print("Informe o salário do programador: ");
        double salarioProgramador = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Informe a linguagem de programação do programador: ");
        String linguagemProgramador = scanner.nextLine();

        Programador programador = new Programador(nomeProgramador, nascProgramador, salarioProgramador, linguagemProgramador);

        System.out.println("\nInformações do Gerente:");
        System.out.println("Nome: " + gerente.nome);
        gerente.calcularIdade();
        gerente.informarSalario();
        gerente.informarProjeto();

        System.out.println("\nInformações do Programador:");
        System.out.println("Nome: " + programador.nome);
        programador.calcularIdade();
        programador.informarSalario();
        programador.informarLinguagem();

        scanner.close();
    }
}