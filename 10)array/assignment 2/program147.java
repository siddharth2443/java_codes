import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
	
		
		System.out.println("Enter First Array Elements : ");

		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Output : ");

		for(int i=0;i<arr.length;i++) {
			if(sumOfDigit(arr[i])%2==0) {
				System.out.println(arr[i]);
			}
		}

	
	}

	static int sumOfDigit(int n) {
		
		int sum=0;
		int rem;
		while(n!=0) {
			rem = n%10;
			sum=sum+rem;
			n=n/10;
		}

		return sum;
	}
}
