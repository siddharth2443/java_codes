class Core {

	public static void main(String[] args) {
		int n=4;
		int x=10;

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			
				System.out.print(x-- + " ");
			}
			System.out.println();
		}	
	}
}
