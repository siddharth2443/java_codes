class Core {
	int x = 10;
	private int y = 20;
	static int z = 30;
	
	void display() {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

class Client {
	public static void main(String[] args) {
		
		Core obj = new Core();

		obj.display();

		obj.x = 100;
		obj.z = 300;

		obj.display();
	}
}
