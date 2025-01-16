package prob2B;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Order
        Order myOrder = new Order("O-001");

        // Displaying information about the created order and its lines
        System.out.println("Created Order ID: " + myOrder.getOrderId());

        for (OrderLine orderLine : myOrder.getOrderLines()) {
            System.out.println("OrderLine belongs to Order with ID: " + orderLine.getOrder().getOrderId());
        }
    }

}
