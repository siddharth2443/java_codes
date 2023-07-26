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
			perfect(arr[i],i);			
		}
	}

	static void perfect(int n,int i) {
	
		int sum=0;
		for(int j=1;j<n;j++) {
		
			if(n%j==0) {
				sum=sum+j;
			}
		}

		if(sum==n) {
			System.out.println("perfect number "+n+" found at index "+i);
		}
	}
}
