class Core {

	public static void main(String[] args) {
		
		
			
		for(int i=1;i<=6;i++) {
			int x=6;
			char ch='F';
			for(int j=1;j<=6;j++) {
			
				if(j%2!=0) {
					System.out.print(ch + " ");
				}
				else {
					System.out.print(x + " ");
				}
				ch--;
				x--;
			}
			System.out.println();
		}	
	}
}
