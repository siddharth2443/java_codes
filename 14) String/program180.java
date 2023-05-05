class Core {
	public static void main(String[] args) {
	
		String str1 = "Siddharth";
		String str2 = new String("Siddharth");
		String str3 = "Siddharth";
		String str4 = new String("Siddharth");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
}
