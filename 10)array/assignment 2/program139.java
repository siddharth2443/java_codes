import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int even=0, odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}

		System.out.println("even count = " +even);
		System.out.println("odd count = " +odd);
	}
}
