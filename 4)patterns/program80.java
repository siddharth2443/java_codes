class Core {

	public static void main(String[] args) {
	
		int x = 1;
		char ch = 'A';
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=4;j++) {
			
				if(j%2==0) {
				
					System.out.print(x++ + " ");
				}
				else {
				
					System.out.print(ch++ + " ");
				}
			}
			System.out.println();
		}	
	}
}

// A 1 B 2
// C 3 D 4
// E 5 F 6 
