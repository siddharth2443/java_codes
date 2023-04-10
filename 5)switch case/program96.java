class Core {
	public static void main(String[] args) {
	
		int a=1;
		int b=2;
		int x=3;
		
		switch(x) {
			
			case a :
				System.out.println("1");
				break;
			case b :
				System.out.println("2");
				break;
			case a+b :
				System.out.println("3");
				break;
			case a+a+b :
				System.out.println("4");
				break;
			default :
				System.out.println("invalid");
				break;
		}
	}
}
//error : variables not allowed
