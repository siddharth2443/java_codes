import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr);

		System.out.println("Enter Your name : ");
		String name = br1.readLine();

		System.out.println("Enter Your age :");
		int age = Integer.parseInt(br1.readLine());

		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
}
