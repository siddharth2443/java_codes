class Core {
	
	int x = 10;

	Core() {
		this(200);			
		System.out.println("In No-args constructor");
	}

	Core(int x) {
		System.out.println("para constructor with prameter "+ x);
	}

	public static void main(String[] args) {
		
		System.out.println("In main function");

		Core obj1 = new Core();
		Core obj2 =  new Core(100);
	}
}
