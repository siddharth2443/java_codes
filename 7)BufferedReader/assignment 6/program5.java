import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Upper Limit :");
		int a = Integer.parseInt(br.readLine());
	
		System.out.println("Enter Lower Limit :");
		int b = Integer.parseInt(br.readLine());
		
		
		for(int i=a;i<=b;i++) {
			per(i);			
		}
	}

	static void per(int n) {
		
		int sum=0;
		for(int i=1;i<n;i++) {
			
			if(n%i==0) {
				sum=sum+i;
			}
		}

		if(sum==n) {
			System.out.println(sum);
		}
	}
}
