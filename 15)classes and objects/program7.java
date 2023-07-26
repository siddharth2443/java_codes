class Core {
	int x = 10;
	String str1 = "Sid";    //init in constructor, ponting to SCP

	void fun() {
		String str2 = "Sid";    //init in method stack frame, pointing to SCP
		String str3 = new String("Siddharth");    //new object on heap
	}

	public static void main(String[] args) {
		Core obj = new Core();
		obj.fun();
	}
}
