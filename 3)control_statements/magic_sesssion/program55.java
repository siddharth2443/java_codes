class Core {
	
	public static void main(String[] args) {
	
		int n = 4334;
		int cpy = n;
		int rem, rev = 0;

		while(n!=0) {
		
			rem = n%10;
			rev = rev*10 +rem;
			n = n / 10;
		}
			
		if(cpy==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
