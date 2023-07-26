import java.util.*;
class Core {
	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter Your dream company:");
		String company;
		company = obj.next();
		
		System.out.println("Enter Your dream package:");
		double salary = obj.nextInt();

		System.out.println("My Dream is to get " + salary + " salary at " + company);

	}
}
