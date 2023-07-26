import java.io.*;
class Core {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Your Fev Batsman : ");
		String bat = br.readLine();

		System.out.println("Enter Your Fev Bowler : ");
		String ball = br.readLine();

		System.out.println(bat);
		System.out.println(ball);
	}
}
