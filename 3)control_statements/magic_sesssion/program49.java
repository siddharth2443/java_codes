class Core {

	public static void main(String[] args) {
	
		int n = 942111423;
		int last, count=0;

		while(n!=0) {
		
			last = n%10;

			if(last%2 != 0) {
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}
}
