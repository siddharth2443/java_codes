class ICC {
	ICC() {
		System.out.println("In ICC Con!!");
	}
}

class BCCI extends ICC {
	BCCI() {
		System.out.println("In BCCI Con!!");
	}
}

class Client {
	public static void main(String[] args) {
		BCCI obj = new BCCI();
	}
}
