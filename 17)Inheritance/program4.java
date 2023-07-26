class Parent {
	static {
		System.out.println("In parent static block!!");
	}
}

class Child extends Parent {
	static {
		System.out.println("In Child static block!!");
	}
}

class Client {
	public static void main(String[] args) {
		System.out.println("In main");
		Child obj = new Child();
	}
}
