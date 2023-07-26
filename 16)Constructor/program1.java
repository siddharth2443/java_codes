class Core {
	
	Core() {
		System.out.println("In constuctor");
	}

	void fun() {
		System.out.println("In Fun");
	}

	public static void main(String[] args) {
		Core obj = new Core();
		obj.fun();
	}
}
