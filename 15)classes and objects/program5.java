class Party {
	
	int people = 200;

	void welcome() {
		System.out.println("Welcome to the party!!");
	}

	public static void main(String[] args) {
		Party p1 = new Party();
		p1.welcome();

		System.out.println("Total number of people in the party = " +p1.people);
	}
}
