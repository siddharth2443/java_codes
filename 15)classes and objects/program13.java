class Core {
	static int x = 10;
	static int b = 20;

	void display() {
		System.out.println(x);
		System.out.println(b);
	}
}

class Client {
	public static void main(String[] args) {
		Core obj = new Core();

		obj.display();

		System.out.println();
		
		Core.x = 100;
		obj.b = 200;

		System.out.println(obj.x);
		System.out.println(Core.b);
	}
}
