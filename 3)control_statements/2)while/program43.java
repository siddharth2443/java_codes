class Core {
	
	public static void main(String[] args) {
		
		int n = 135;
		int rem, mult = 1;

		while(n!=0) {
			
			rem = n%10;
			mult = mult*rem;
			n = n/10;
		}

		System.out.println(mult);
	}
}
