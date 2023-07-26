import java.io.*;
class Core {
	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr);
	
		System.out.println("Enter string");
		String str1 = br1.readLine();

		br1.close();

		System.out.println("Enter char1");
		char ch = (char)isr.read();

	}
}
