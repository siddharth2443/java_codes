import java.io.*;
class Core {
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter Socity name : ");
		String name = br.readLine();
		
		System.out.println("Enter Wing : ");
		char wing = (char)br.read();

		br.skip(1);

		System.out.println("Enter Flant number : ");
		int flat = Integer.parseInt(br.readLine());

		System.out.println(name + " " + wing + " " + flat );
	}
}
