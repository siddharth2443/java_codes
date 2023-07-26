class Core {
	
	Core() {
		System.out.println("This is Constructor");
	}

	{
		System.out.println("Instance Block 1");	
	}

	public static void main(String[] args) {
		Core obj = new Core();
		System.out.println("In Main Function");
	}

	{
		System.out.println("Instance block 2");
	}

	static {
		System.out.println("Core static block");
	}
}
class Client {

	{
		System.out.println("Client Instance block");	
	}

	public static void main(String[] args) {
		Core obj = new Core();
	}
}
