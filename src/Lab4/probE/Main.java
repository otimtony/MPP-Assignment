package Lab4.probE;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account[] checkingAccounts = new CheckingAccount[2];
        checkingAccounts[0] = new CheckingAccount("S1002", 12.00, 50);
        checkingAccounts[1] = new CheckingAccount("S1000", 16.00, 100);
        Account[] savingsAccounts = new SavingsAccount[3];
        savingsAccounts[0] = new SavingsAccount("S1203", 0.1, 100);
        savingsAccounts[1] = new SavingsAccount("S1382", 0.2, 100);
        savingsAccounts[2] = new SavingsAccount("S1322", 0.3, 300);


        Employee e1 = new Employee("Tony");
        Employee e2 = new Employee("Otim");
        Employee e3 = new Employee("Jeffers");

        e1.addAccount(checkingAccounts[0]);
        e1.addAccount(savingsAccounts[0]);

        e2.addAccount(checkingAccounts[1]);
        e2.addAccount(savingsAccounts[1]);

        e3.addAccount(savingsAccounts[2]);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println(Admin.computeUpdatedBalanceSum(employees));

    }
}
