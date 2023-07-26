class Core {
	int x = 10;

	Core() {
		System.out.println("In Constructor");
		System.out.println(this.x);
	}

	void fun() {
		System.out.println("In fun");
		System.out.println(this);
		System.out.println(x);
	}

	public static void  main(String[] args) {
		Core obj = new Core();
		
		System.out.println("In Main");
		System.out.println(obj);
		obj.fun();
	}
}
