class Core {

	public static void main(String[] args) {
	
		int n = 942111423;
		int last;

		while(n!=0) {
			
			last = n%10;

			if(last%2==0) {
			
				System.out.println(last*last + " ");
			}
			n=n/10;
		}
	}
}
