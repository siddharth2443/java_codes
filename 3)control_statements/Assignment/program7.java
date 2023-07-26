class Core {
	
	public static void main(String[] args) {
		
		double cp = 300;
		double sp = 200;

		if(sp > cp) {
			System.out.println("profit of : " + (sp-cp) + "Rs.");
		}
		else if (cp > sp) {
			System.out.println("loss of : " + (cp-sp) + "Rs.");
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
