class Core2web {
	int noOfCourses = 5;
	private String favCourse = "JAVA";

	void display() {
		
		System.out.println(noOfCourses);
		System.out.println(favCourse);
	}
}

class User {
	public static void main(String[] args) {
		Core2web obj = new Core2web();

		obj.display();
		
		System.out.println(obj.noOfCourses);
		System.out.println(obj.favCourse);       //error : variable is private
	}
}
