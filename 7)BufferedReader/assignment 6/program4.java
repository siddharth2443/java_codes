import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Upper Limit :");
		int a = Integer.parseInt(br.readLine());
	
		System.out.println("Enter Lower Limit :");
		int b = Integer.parseInt(br.readLine());
		
		
		for(int i=a;i<=b;i++) {
			perCube(i,b);			
		}
	}

	static void perCube(int n,int b) {
	
		if(n*n*n<=b) {
			System.out.println(n*n*n);
		}
	}
}
