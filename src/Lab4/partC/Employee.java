package Lab4.partC;

abstract public class Employee {
    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public void print() {};

    public final Paycheck calcCompensation(int month,int year) {

        double grossPay = calcGrossPay(month, year);

        double state = grossPay * 0.05;
        double fica =  grossPay * 0.23;
        double socialSecurity = grossPay * 0.075;
        double local = grossPay * 0.01;
        double medicare = grossPay * 0.03;

        return new Paycheck(grossPay, fica, state, local, medicare, socialSecurity);
    };

    public abstract double calcGrossPay(int month, int year);
}
