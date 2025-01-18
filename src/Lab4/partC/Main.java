package Lab4.partC;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Salaried Employee
        Employee salaried = new Salaried("02", 800.0);
        Paycheck salariedPaycheck = salaried.calcCompensation(1, 2025);
        System.out.println("Salaried Employee: ");
        salariedPaycheck.print();

        // Hourly Employee
        Employee hourly = new Hourly("01", 10.0, 20);
        Paycheck hourlyPaycheck = hourly.calcCompensation(1, 2025);
        System.out.println("Hourly Employee: ");
        hourlyPaycheck.print();

        // Commissioned Employee
        Order order1 = new Order("01", LocalDate.of(2025, 1, 2), 120.0);
        Order order2 = new Order("02", LocalDate.of(2025, 1, 18), 800.0);

        Order[] orders = {order1, order2};
        Employee commissioned = new Commissioned("03", 1400.0, 0.1, orders);
        Paycheck commissionedPaycheck = commissioned.calcCompensation(1, 2025);
        System.out.println("Commissioned Employee: ");
        commissionedPaycheck.print();

    }
}
