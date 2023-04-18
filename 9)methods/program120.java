class Core {
	
	public static void main(String[] args) {
	
		Core obj =new Core();
		
		int a = obj.fun(10);
		System.out.println(a);

	}

	int fun(int x) {
	
		int y = x+10;

		return y;
	}
}
