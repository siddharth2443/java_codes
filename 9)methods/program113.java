import java.util.*;

class Core {
	
 	static void add(int n1, int n2) {
	
		int sum = n1+n2;
	      	System.out.println(sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Give 2 int :");

		int a = sc.nextInt();
		int b = sc.nextInt();

		add(a,b);
	}
}
