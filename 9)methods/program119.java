class Core {
	public static void main(String[] args) {
		
		Core obj = new Core();

		System.out.println(obj.fun(10));
	}

	void fun(int x) {
		
		return x+10;
	}
}
//error : void not allowd if want to return some value
