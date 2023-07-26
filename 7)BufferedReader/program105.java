import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name : ");
		String str1 = br1.readLine();
		
		br1.close();

		System.out.println("Enter Surname : ");
		String str2 = br2.readLine();

		System.out.println(str1);
		System.out.println(str2);



	}
}
