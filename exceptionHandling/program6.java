class Core {
	
	void m1() {
		System.out.println("In-m1");
	}
	
	void m2() {
		System.out.println("In m2");
	}
	
	public static void main(String[] args) {
		Core obj = new Core();

		obj.m1();

		obj=null;

		try {
			obj.m2();
		} catch(ArithmeticException npe) {
			System.out.println("Arithmetic Exception");
		}
		//nally {
		//	system.out.println("In-Finally");
		//}

		System.out.println("End main");

	}
}
