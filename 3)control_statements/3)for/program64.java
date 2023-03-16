class Core {

	public static void main(String[] args) {
	

		int n = 6;
		int ans = 0;
		
		for(int i=1;i<n;i++) {
		
			if(n%i==0) {
			
				ans = ans + i;
			}
		}

		if(ans == n) {
		
			System.out.println("perfect");
		}
		else {
		
			System.out.println("not perfect");
		}
	}
}
