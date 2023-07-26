import java.io.*;
class Core {
	public static void main(String[] args) {
		
		Core obj = new Core();

		int x = obj.fun(10);
		System.out.println(x);
			
	}
	
	int fun(int x) {
	
		int val = x + 50;
		return val;
	}
}
