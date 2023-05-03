class Core {
	public static void main(String[] args) {
	
		String str1 = "Siddharth";
		String str2 = "Ghumare";
		String str3 = "SiddharthGhumare";
		String str4 = str1 + str2;

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
