package errado;

public class OrderServiceErrado {
    public void createOrder(String orderData) {
        System.out.println("Pedido criado: " + orderData);
    }

    public void saveOrderToDatabase(String orderData) {
        System.out.println("Salvando pedido no banco de dados...");
    }

    public void sendEmailNotification(String orderData) {
        System.out.println("Enviando e-mail de confirmação...");
    }

    public void processOrder(String orderData) {
        // Faz tudo em um só lugar (violando SRP)
        createOrder(orderData);
        saveOrderToDatabase(orderData);
        sendEmailNotification(orderData);
        System.out.println("Processamento completo (código errado).");
    }
}