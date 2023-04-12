class Core {
	
	int x=10;
	static int y=20;
	
	static void fun() {
		
		System.out.println("Inside Fun");
	}

	void gun() {
		
		System.out.println("Inside gun");
	}

	public static void main(String[] args) {
	
		Core obj = new Core();

		obj.gun();
		fun();                                  //or obj.fun(); (both will work);

		System.out.println(obj.x);
		System.out.println(y);                  //or obj.y      (both will work);

	}
}
