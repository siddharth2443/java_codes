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
			System.out.println(rev(arr[i]));			
		}
	}

	static int rev(int n) {
		
		int rev=0, rem;

		while(n!=0) {
			
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}

		return rev;
	}
}
