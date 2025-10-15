import java.util.Scanner;
import errado.OrderServiceErrado;
import correto.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println(" Demonstração do SRP (SOLID) ");
        System.out.println("==============================");
        System.out.println("1 - Executar código ERRADO (violando SRP)");
        System.out.println("2 - Executar código CORRETO (aplicando SRP)");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        System.out.println();

        switch (opcao) {
            case 1:
                System.out.println("==> Executando código ERRADO:");
                OrderServiceErrado errado = new OrderServiceErrado();
                errado.processOrder("Pedido #1234 - Notebook Dell");
                break;

            case 2:
                System.out.println("==> Executando código CORRETO:");
                OrderRepository repo = new OrderRepository();
                EmailService email = new EmailService();
                OrderService correto = new OrderService(repo, email);
                correto.createOrder("Pedido #1234 - Notebook Dell");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}