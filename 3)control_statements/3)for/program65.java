class Core {

	public static void main(String[] args) {
	
		int n = 153;
		int count=0;
		int temp1 = n, temp2 = n;
		int sum = 0;
		int rem;

		while(temp1!=0) {
		
			temp1 = temp1/10;
			count++;
		}

		while(n!=0) {
		
			int mult = 1;

			rem = n % 10;
			
			for(int j=1;j<=count;j++) {
			
				mult = mult * rem;
			}	
			
			sum = sum + mult;
			n = n/10;
		}

		System.out.println(sum);

		if(temp2 == sum) {
		
			System.out.println("Armstrong");
		}
		else {
		
			System.out.println("Not Armstrong");
		}
	}
}
