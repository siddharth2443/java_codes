import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Upper Limit :");
		int a = Integer.parseInt(br.readLine());
	
		System.out.println("Enter Lower Limit :");
		int b = Integer.parseInt(br.readLine());
		
		int count=0;		
		for(int i=a;i<=b;i++) {
			
			if(i%5==0) {
				System.out.println(i);
			}

			if(i%2==0) {
				count++;
			}
		}

		System.out.println("Even count = " +count);
	}
}
