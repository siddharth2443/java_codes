class Core {
	
	static void fun() {
		System.out.println("Inside Fun");
	}
	
	void gun() {
		System.out.println("Inside gun");
	}

	public static void main(String[] args) {
		fun();
		gun();
	}
}
//error : cannot access non static methods inside static context main
//two solutions : 1) create object of class and access through it
//                2) make the gun() method static
