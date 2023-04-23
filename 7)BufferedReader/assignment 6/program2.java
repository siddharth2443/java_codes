import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Upper Limit :");
		int a = Integer.parseInt(br.readLine());
	
		System.out.println("Enter Lower Limit :");
		int b = Integer.parseInt(br.readLine());
		
		
		for(int i=a;i<=b;i++) {
			
			isComp(i);			
		}
	}

	static void isComp(int n) {
	
		int count=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count>1) {
			System.out.println(n);
		}
	}

}
