import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i=0;i<5;i++) {
		
			System.out.println("Enter Number :");
			int a = Integer.parseInt(br.readLine());

			digitCount(a);
		}
					
	}


	static void digitCount(int n) {
	
		int count=0;
		while(n!=0) {
		
			n=n/10;
			count++;
		}

		System.out.println("digit Count = " +count);
	}
}
