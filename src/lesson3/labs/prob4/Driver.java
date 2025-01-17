package lesson3.labs.prob4;

public class Driver {

	public static void main(String[] args) {
		Property[] objects = { new House("Los Angeles",9000), new Condo("Miami", 2), new Trailer("HomeDepot", "park 12") };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}
}
