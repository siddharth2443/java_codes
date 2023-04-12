import java.util.*;
import java.io.*;
class Core {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter veg/non-veg(v/n), Item, quantity, price");
		String info = br.readLine();

		StringTokenizer st = new StringTokenizer(info, ",");

		String t1 = st.nextToken();
		String t2 = st.nextToken();
		String t3 = st.nextToken();
		String t4 = st.nextToken();

		char vn = t1.charAt(0);
		int qt = Integer.parseInt(t3);
		float pr = Float.parseFloat(t4);

		System.out.println("veg/non-veg" +vn);
		System.out.println("Item" +t2);
		System.out.println("quantity" +qt);
		System.out.println("price" +pr);
	}
}
