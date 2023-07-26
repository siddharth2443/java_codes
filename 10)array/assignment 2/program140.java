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

		int sumEven=0, sumOdd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sumEven=sumEven+arr[i];
			}
			else {
				sumOdd=sumOdd+arr[i];
			}
		}

		System.out.println("even sum = " +sumEven);
		System.out.println("odd sum = " +sumOdd);
	}
}
