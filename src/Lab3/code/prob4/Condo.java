package Lab3.code.prob4;

public class Condo extends Property{

    int numberOfFloors;

    Condo(String address, double rent, int numberOfFloors){
        super(address, rent);
        this.numberOfFloors = numberOfFloors;
    }

    public double getNumberOfFlows() {
        return numberOfFloors;
    }

    public void setNumberOfFlows(int numberOfFlows) {
        this.numberOfFloors = numberOfFlows;
    }

    public double computeRent(){
        return numberOfFloors * 400;
    }

}
