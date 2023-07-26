class Core {

	public static void main(String[] args) {
	
		int days=7;

		while(days>=0) {
			if(days==0) {
				System.out.println(days + " day Assignment overdue");
			}
			else{
			System.out.println(days + " days remaining");
			}
			days--;
		}
	}
}
