import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Rows : ");
		int n = Integer.parseInt(br.readLine());

		for(int i=1;i<=n;i++) {
			char ch='A';
			int p=n;
			int q=1;
			for(int j=1;j<=n;j++) {
				if(i%2==1) {
					System.out.print((char)(ch+n-1) +""+ p--  + " ");
					ch--;
				}
				else {
					System.out.print(ch +""+ q++ + " ");
					ch++;
				}
			}
			System.out.println();

		}
	}
}
