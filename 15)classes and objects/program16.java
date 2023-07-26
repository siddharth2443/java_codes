class Core {
	static {
		System.out.println("In Core Static block");
	}

	public static void main(String[] args) {
		
		System.out.println("In Core main");
		Client obj = new Client();
	}
}

class Client {
	static {
		System.out.println("In Client static block 1");
	}

	public static void main(String[] args) {
		System.out.println("In Client Main");
	}

	static {
		System.out.println("In Client static block 2");
	}
}
