package correto;

public class OrderService {
    private final OrderRepository orderRepository;
    private final EmailService emailService;

    public OrderService(OrderRepository orderRepository, EmailService emailService) {
        this.orderRepository = orderRepository;
        this.emailService = emailService;
    }

    public void createOrder(String orderData) {
        orderRepository.save(orderData);
        emailService.sendConfirmation(orderData);
        System.out.println("Pedido criado com sucesso! (código correto)");
    }
}