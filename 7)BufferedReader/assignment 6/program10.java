import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Upper Limit :");
		int a = Integer.parseInt(br.readLine());
	
		System.out.println("Enter Lower Limit :");
		int b = Integer.parseInt(br.readLine());
		
		
		for(int i=a;i<=b;i++) {
			armStrong(i);			
		}
	}

	static void armStrong(int n) {
	
		int rem;
		int temp1=n;
		int temp2=n;
		int count=0,sum=0;
		
		while(temp1!=0) {
			temp1=temp1/10;
			count++;
		}

		while(n!=0) {
			rem=n%10;
			sum=sum+power(rem,count);
			n=n/10;
		}

		if(sum==temp2) {
			System.out.println(sum);
		}
		
	}

	static int power(int n,int p) {
	
		int mult=1;
		for(int i=1;i<=p;i++) {
		
			mult=mult*n;
			
		}

		return mult;
	}
}
