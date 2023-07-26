class Core {
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		} catch(ArithmeticException obj) {
			System.out.println("Don't divide by zero you idiot");
		}

		System.out.println("End main");
	}
}
