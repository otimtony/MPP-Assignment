package Lab3.code.prob4;

public class Trailer extends Property{

    String trailerParkAddress;

    Trailer(String address, double rent, String trailerParkAddress){
        super(address, rent);
        this.trailerParkAddress = trailerParkAddress;
    }

    public String getTrailerParkAddress() {
        return trailerParkAddress;
    }

    public void setTrailerParkAddress(String trailerParkAddress) {
        this.trailerParkAddress = trailerParkAddress;
    }

    public double computeRent(){
        return 500;
    }

}
