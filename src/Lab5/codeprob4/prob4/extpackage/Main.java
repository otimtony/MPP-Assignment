package Lab5.codeprob4.prob4.extpackage;

import java.time.LocalDate;

import Lab5.codeprob4.prob4.Customer;
import Lab5.codeprob4.prob4.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		Order order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());
	}
}

		
