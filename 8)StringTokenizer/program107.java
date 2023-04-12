import java.util.*;
import java.io.*;
class Core {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Socity, wing, FlatNo. : ");
		String info = br.readLine();

		StringTokenizer st = new StringTokenizer(info,",");

		String socity = st.nextToken();
		String wing = st.nextToken();
		String flat = st.nextToken();

		System.out.println("Socity=" +socity);
		System.out.println("wing="+wing);
		System.out.println("flat="+flat);
	}
}
