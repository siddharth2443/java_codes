class Core {

	public static void main(String[] args) {
	
		int sum=0, mult=1;
		int i=1;

		while(i<=10) {
			if(i%2==0) {
			
				sum=sum+1;
			}
			else if(i%2!=0) {
			
				mult=mult*i;
			}
			else {
				System.out.println("Invald Input");
			}
			i++;
		}

		System.out.println("sum of even numbers:" + sum);
		System.out.println("multiplication of odd numbers:" + mult);
	}
}
