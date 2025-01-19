package Lab4.partC;

public class Paycheck {

    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;

    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    public String print(){
        return "Gross Pay: " + grossPay + " and Net Pay: " + getNetPay();
    }

    public double getNetPay() {
        return grossPay - (fica + state + local + medicare + socialSecurity);
    }
}
