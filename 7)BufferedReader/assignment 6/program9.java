import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Upper Limit :");
		int a = Integer.parseInt(br.readLine());
	
		System.out.println("Enter Lower Limit :");
		int b = Integer.parseInt(br.readLine());
		
		
		for(int i=a;i<=b;i++) {
			strong(i);			
		}
	}

	static void strong(int n) {
	
		int rem,sum=0,temp=n;
		while(n!=0) {
			rem=n%10;
			sum=sum+fact(rem);
			n=n/10;
		}

		if(temp==sum) {
			System.out.println(sum);
		}
		
	}

	static int fact(int n) {
	
		int fact=1;
		for(int i=1;i<=n;i++) {
		
			fact=fact*i;
		}

		return fact;
	}
}
