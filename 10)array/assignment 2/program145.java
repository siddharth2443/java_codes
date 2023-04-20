import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());

		int arr1[] = new int[size];
		int arr2[] = new int[size];
		
		System.out.println("Enter First Array Elements : ");

		for(int i=0;i<arr1.length;i++) {
			arr1[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter Second Array Element : ");
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Un-commen Elements : ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					arr1[i]=0;
					arr2[j]=0;
				}
			}
		}

		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=0)
			System.out.println(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]!=0)
			System.out.println(arr2[i]);
		}
	}
}
