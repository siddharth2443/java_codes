class Core {

	public static void main(String[] args) {
		
		int x=1;
		for(int i=1;i<=3;i++) {
			int n=3;
			for(int j=1;j<=3;j++) {
			
				System.out.print((x*x) + "C" + (n--) + " ");
				x++;
			}
			System.out.println();
		}	
	}
}
