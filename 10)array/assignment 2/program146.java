import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array 1 size : ");
		int size1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter array 2 size : ");
		int size2 = Integer.parseInt(br.readLine());

		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		int ans[] = new int[size1+size2];
		
		System.out.println("Enter First Array Elements : ");

		for(int i=0;i<arr1.length;i++) {
			arr1[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter Second Array Element : ");
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("merged array : ");
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<arr1.lenghth;j++) {
				ans[j]=arr1[j];
				if()	
			}
			
		}
		for(int i=0;i<arr1.length;i++) {
			ans[i]=arr1[i];
		}
		for(int i=arr1.length;i<ans.length) {
			ans[i] = 
		}
	}
}
