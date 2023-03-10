class Core {
	
	public static void main(String[] args) {
		
		int unit = 200;
		int bill;

		if(unit > 100) {
			bill = 100 + ((unit-100)*2);
			System.out.println(bill);		
		}
		else {
			System.out.println(unit);
		}
	}
}
