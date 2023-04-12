import java.util.*;
class Core {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter full name : ");
		String info = sc.nextLine();

		StringTokenizer st = new StringTokenizer(info,",");

		System.out.println(st.countTokens());

		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
		}
	}
}
