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
			arm(arr[i],i);			
		}
	}

	static void arm(int n,int i) {
	
		int temp1=n;
		int count=0;
		int temp2=n;
		int rem,sum=0;

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
			System.out.println("composite "+sum+" found at index "+i);
		}
	}

	static int power(int n,int p) {
		
		int power=1;

		for(int i=1;i<=p;i++) {
		
			power=power*n;
		}

		return power;
	}
}
