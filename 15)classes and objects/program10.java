class C2W {
	
	int noOfCources = 5;
	String fevCourse = "Java + DSA";

	void display() {
		System.out.println("Total Number of Courses = " + noOfCources);
		System.out.println("My Favourite Course is : " + fevCourse);
	}
}

class User {
	public static void main(String[] args) {
		C2W s1 = new C2W();

		s1.display();
	}
}
