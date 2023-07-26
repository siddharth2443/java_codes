import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Upper Limit :");
		int a = Integer.parseInt(br.readLine());
	
		System.out.println("Enter Lower Limit :");
		int b = Integer.parseInt(br.readLine());
		
		
		for(int i=a;i<=b;i++) {
			rev(i);			
		}
	}

	static void rev(int n) {
	
		int rev=0,rem;

		while(n!=0) {
		
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}

		System.out.println(rev);
	}
}
