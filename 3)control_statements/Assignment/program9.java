class Core {
	
	public static void main(String[] args) {
		
		int a = 3, b = 4, c = 5;

		int a2 = a*a, b2 = b*b, c2 = c*c;

		if(a2 + b2 == c2) {
			System.out.println("yes");
		}
		else if(a2 + c2 == b2) {
			System.out.println("yes");
		}
		else if(b2 + c2 == a2) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
