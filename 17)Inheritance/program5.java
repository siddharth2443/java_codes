class Parent {
	static int x = 10;
	static {
		System.out.println("In parent static block");
	}
	{
		System.out.println("parent blllloooocccckkkk");
	}

	static void access() {
		System.out.println(x);
	}
}
class Child extends Parent {
	static {
		System.out.println("In Child static block");
		System.out.println(x);
		access();
	}
}

class Client {
	public static void main(String[] args) {
		System.out.println("In main");
		Child obj = new Child();
	}
}
