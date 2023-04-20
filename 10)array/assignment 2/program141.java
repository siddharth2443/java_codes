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
		
		System.out.println("Enter Element to search : ");
		int x = Integer.parseInt(br.readLine());

		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.println(x + " found at index number " + i);
			}
		}
	}
}
