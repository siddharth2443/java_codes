class Core {

	public static void main(String[] args) {
	
		int n = 8;

		if(n%2==0) {
			while(n>0) {
			System.out.println(n);
			n--;
			}
		}
		else if(n%2!=0) {
			while(n>0) {
			System.out.println(n);
			n=n-2;
			}
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
