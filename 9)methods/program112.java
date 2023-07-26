class Core {
	int x = 10;
	static int y = 20;

	void fun() {
		
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
	
		Core c1 = new Core();

		c1.fun();
	}
}
