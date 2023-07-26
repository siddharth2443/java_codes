class Core {
	
	public static void main(String[] args) {
		
		Core obj = new Core();

		obj.fun(10.5f);
		obj.fun(10);
		obj.fun('A');
	}

	void fun(float x) {
		System.out.println(x);
	}

}
