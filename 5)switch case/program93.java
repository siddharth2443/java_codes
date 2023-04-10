class Core {
	public static void main(String[] args) {
	
		int x=3;

		System.out.println("before switch");

		switch(x) {
		
			case 1 :
				System.out.println("one");
				break;
			case 2 :
				System.out.println("two");
				break;
			case 3 :
				System.out.println("three");
				
			case 4 :
				System.out.println("four");
				break;	
			default :
				System.out.println("no match");
				break;
		}
		System.out.println("After switch");
	}
}
