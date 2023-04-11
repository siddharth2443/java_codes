import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter player name : ");
		String name = br.readLine();

		System.out.println("Enter Jersey no. : ");
		int jno = Integer.parseInt(br.readLine());

		System.out.println("Enter Batting Average : ");
		float avg = Float.parseFloat(br.readLine());

		System.out.println("Batsman Name : " + name);
		System.out.println("Jersey number : " + jno);
		System.out.println("Batting Average : " +avg);
	
	}
}
