package Lab3.code.prob4;

abstract class Property {
    String address;
    double rent;

    Property(String address, double rent){
        this.address = address;
        this.rent = rent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public abstract double computeRent();
}
