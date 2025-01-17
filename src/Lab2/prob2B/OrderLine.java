package Lab2.prob2B;

public class OrderLine {
    private Order order;

    public OrderLine(Order order) {
        this.order = order;  // OrderLine contains the Order instance
    }

    public Order getOrder() {
        return order;
    }

}
