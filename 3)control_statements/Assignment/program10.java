class Core {
	
	public static void main(String[] args) {
		
		int wakeUpTime = 9;

		if(wakeUpTime == 7) {
			System.out.println("Take bath and go for first lecture");
		}
		else if(wakeUpTime == 8) {
			System.out.println("No bath and go for first lecture");
		}
		else if(wakeUpTime == 9) {
			System.out.println("Skip first lecture");
		}
		else {
			System.out.println("Bunk");
		}
	}
}
