package Lab3.code.prob4;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property property : properties) {
			System.out.println("........" + property.computeRent());

//			totalRent += property.computeRent();
		}
//		return totalRent;
		return 0.0;
	}
}
