class Parent{
	Parent() {
		System.out.println("In Parent Con!!");
	}
	void parentProperty() {
		System.out.println("Parent Home, Parent Savings, Parent land");
	}
}

class Child extends Parent {
	Child() {
		System.out.println("In Child Con!!");
	}
}

class Client {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.parentProperty();
	}
}
