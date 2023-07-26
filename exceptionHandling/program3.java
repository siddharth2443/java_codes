//NullPointerException


class Core {
	void m1() {
		System.out.println("suiii");
	}

	public static void main(String[] args) {
		Core obj = new Core();

		obj.m1();

		obj = null;

		obj.m1();

	}
}
