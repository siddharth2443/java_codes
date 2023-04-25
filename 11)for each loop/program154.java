import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
	
		int arr[] = {10,20,30,40,50};

		for(int i=0;i<arr.length;i++) {
		
			System.out.println(arr[i]);
		}

		for(int x : arr) {
		
			System.out.println(x);
		}
		
	}
}
