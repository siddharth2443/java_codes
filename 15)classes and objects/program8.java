class Core {
	String proName = "E-Comm WebApp";
	int noOfEmp = 20;

	void clientInfo() {
		String clientName = "Core2Web";
		System.out.println(clientName);
		System.out.println(proName);
		System.out.println(noOfEmp);
	}

}
class C2W {
	public static void main(String[] args) {
	Core c1 = new Core();
	c1.clientInfo();
	}
}
