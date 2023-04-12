import java.util.*;
class Core {
	
	void add(int x, int y) {
	
		int ans = x+y;
		System.out.println(ans);
	}
	void sub(int x, int y) {
	
		int ans = x-y;
		System.out.println(ans);
	}
	void mult(int x, int y) {
	
		int ans = x*y;
		System.out.println(ans);
	}
	void div(int x, int y) {
	
		int ans = x/y;
		System.out.println(ans);
	}	
	

	public static void main(String[] args) {
		
		Core c = new Core();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two int : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		c.add(a,b);
		c.sub(a,b);
		c.mult(a,b);
		c.div(a,b);
	}
}
