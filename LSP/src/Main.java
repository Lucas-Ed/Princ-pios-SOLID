import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Demonstração do Princípio da Substituição de Liskov (LSP) ===");
        System.out.println("1 - Exemplo ERRADO (violando o LSP)");
        System.out.println("2 - Exemplo CORRETO (respeitando o LSP)");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        System.out.println();

        switch (opcao) {
            case 1:
                System.out.println("--- Executando exemplo ERRADO ---");
                ViolacaoLSP.executar();
                break;

            case 2:
                System.out.println("--- Executando exemplo CORRETO ---");
                executarCorreto();
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        scanner.close();
    }

    private static void executarCorreto() {
        Forma f1 = new Retangulo(5, 10);
        Forma f2 = new Quadrado(5);

        System.out.println(f1.toString() + " → Área: " + f1.getArea());
        System.out.println(f2.toString() + " → Área: " + f2.getArea());
    }
}