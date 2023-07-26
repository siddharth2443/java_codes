class Core {

	public static void main(String[] args) {
		int n=4;
		int x=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
			
				if(j%2==0) {
					System.out.print(x*x + " ");
				}
				else {
				
					System.out.print(x + " ");
				}
				x++;
			}
			System.out.println();
		}	
	}
}
