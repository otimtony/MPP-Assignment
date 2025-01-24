package Lab5.codeprob4.prob4;

import java.time.LocalDate;

public class CustOrderFactory {
    private CustOrderFactory() { }
    public static Customer createCustomer(String name) {
        return Customer.newCustomer(name);
    }
    public static Order createOrder(LocalDate date) {
        return Order.newOrder(date);
    }
}
