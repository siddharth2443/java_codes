import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size :");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Array Elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println();
	
		for(int i=0;i<arr.length;i++) {
			strong(arr[i],i);			
		}
	}

	static void strong(int n,int i) {
	
		int rem,sum=0;
		int temp=n;
		while(n!=0) {
			rem=n%10;
			sum=sum+fact(rem);
			n=n/10;
		}

		if(sum==temp) {
			System.out.println("Strong "+temp+" found at index "+i);
		}
	}

	static int fact(int p) {
		
		int fac=1;
		while(p>0) {
			fac=fac*p;
			p--;
		}

		return fac;
	}
}
