class MCD {
	int noOfBurgers = 5;
	String product = "French Fries";

	void menu() {
		String menuOne = "Veg";
		String menuTwo = "Non-Veg";
		
		System.out.println(noOfBurgers);
		System.out.println(product);
		System.out.println(menuOne);
		System.out.println(menuTwo);
		
	}
}
class Order {
	public static void main(String[] args) {
		MCD m1 = new MCD();

		m1.menu();
	}
}
