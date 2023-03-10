class Core {
	
	public static void main(String[] args) {
		
		int x = 5;
		int y = 7;

		int ans = x && y;

		System.out.println(ans);
	}
}

//Error : bad operand types for binary operator '&&
//because x and y is considered as number and && operator requires boolien operands
