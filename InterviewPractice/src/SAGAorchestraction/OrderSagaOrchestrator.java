package SAGAorchestraction;

/* 
@Service
public class OrderSagaOrchestrator {

    private final PaymentServiceClient paymentService;
    private final InventoryServiceClient inventoryService;
    private final OrderServiceClient orderService;

    public OrderSagaOrchestrator(PaymentServiceClient paymentService,
                                 InventoryServiceClient inventoryService,
                                 OrderServiceClient orderService) {
        this.paymentService = paymentService;
        this.inventoryService = inventoryService;
        this.orderService = orderService;
    }

    public void startOrderSaga(OrderRequest orderRequest) {
        try {
            // Step 1: Create Order
            Order order = orderService.createOrder(orderRequest);

            // Step 2: Process Payment
            paymentService.processPayment(order.getId(), orderRequest.getAmount());

            // Step 3: Reserve Inventory
            inventoryService.reserveProduct(order.getProductId(), order.getQuantity());

            // Step 4: Mark Order as Completed
            orderService.updateOrderStatus(order.getId(), "CONFIRMED");
        } catch (Exception e) {
            // Compensation logic
            handleFailure(orderRequest);
        }
    }

    private void handleFailure(OrderRequest orderRequest) {
        paymentService.refundPayment(orderRequest.getId());
        inventoryService.releaseInventory(orderRequest.getProductId(), orderRequest.getQuantity());
        orderService.updateOrderStatus(orderRequest.getId(), "CANCELLED");
    }
}
*/



