package Lab3.code.prob4;

public class Driver {
	public static void main(String[] args) {

		Property[] properties = {
				new House("Fairfield", 2000, 9000),
				new Condo("Ottumwa", 100,2),
				new Trailer("", 0, "Argiro Parking")
		};
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println(totalRent);
	}
}
