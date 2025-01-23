package Lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<OrderLine> orderLines;

    public Order(String orderId) {
        this.orderId = orderId;
        this.orderLines = new ArrayList<>();
        OrderLine orderLine = new OrderLine(this);
        this.orderLines.add(orderLine);
    }

    public String getOrderId() {
        return orderId;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
}
