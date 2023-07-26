class Core {
	Core() {
		System.out.println("In Constructor!!");
	}

	void fun() {
		System.out.println("In Fun");
		Core obj0 = new Core();
	}

	public static void main(String[] args) {
		Core obj1 = new Core();
	       	Core obj2 = new Core();

		obj1.fun();
	}
}
