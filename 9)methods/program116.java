class Core {
	void fun(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
	
		Core obj = new Core();

		obj.fun(10);
		obj.fun(10.5);
	}
}
//error : 
//	Incompatible types : possible loosy conversion from float to int
