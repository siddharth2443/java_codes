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
			prime(arr[i],i);			
		}
	}

	static void prime(int n,int i) {
	
		int count=0;
		for(int j=1;j<n;j++) {
		
			if(n%j==0) {
				count++;
			}
		}

		if(count==1) {
			System.out.println("prime "+n+" found at index "+i);
		}
	}
}
