import java.io.*;
class Core {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your age : ");

		int age=0;
		try {
			try {
				age = Integer.parseInt(br.readLine());
			} catch(NumberFormatException obj1) {
				System.out.println("Enter Integer value : ");
				age = Integer.parseInt(br.readLine());
			}
		
		} catch(IOException obj) { 
				
		} 
			

		System.out.println("age = " + age);
	}
}
