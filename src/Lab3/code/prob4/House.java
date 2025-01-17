package Lab3.code.prob4;

public class House extends Property{
    double lotSize;

    House(String address, double rent, double lotSize){
        super(address, rent);
        this.lotSize = lotSize;
    }

    public double getLotSize() {
        return lotSize;
    }

    public void setLotSize(double lotSize) {
        this.lotSize = lotSize;
    }

    public double computeRent(){
        return 0.1 * lotSize;
    }
}
