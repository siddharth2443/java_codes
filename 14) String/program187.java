class Core {
	public static void main(String[] args) {
	
		String str1 = "Siddharth";
		
		System.out.println(str1.length());
		System.out.println(myLen(str1));
	}
	
	static int myLen(String str) {
		
		char arr[] = str.toCharArray();

		int count = 0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}

		return count;
	}
}
