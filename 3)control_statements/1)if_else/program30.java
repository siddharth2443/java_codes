class Core {
	
	public static void main(String[] args) {
		float temp = 96.5f;

		if(temp > 98.6f) {
			System.out.println("High");
		}
		else if(98.6<=temp && temp>=98.0) {
			System.out.println("Normal");
		}
		else {
			System.out.println("low");
		}
	}
}
