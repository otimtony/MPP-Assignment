package Lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<OrderLine> orderLines;

    public Order(String orderId) {
        this.orderId = orderId;
        this.orderLines = new ArrayList<>();
        // Create an OrderLine instance whenever an Order is created
        OrderLine orderLine = new OrderLine(this);  // OrderLine contains the Order instance
        this.orderLines.add(orderLine);
    }

    public String getOrderId() {
        return orderId;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
}
