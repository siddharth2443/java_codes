class Core {
	
	public static void main(String[] sid) {
		
	int num1 =5, num2 = 2, num3 = 2;

	if(num1 == num2 && num3>num1) {
		System.out.println(num3 + " is maximum");
	}
	else if(num2 == num3 && num1>num2) {
		System.out.println(num1 + " is maximum");
	}
	else if (num1 == num3 && num2>num1) {
		System.out.println(num2 + " is maximum");
	}
	else if (num1==num2 && num2==num3) {
		System.out.println("All three are equal");
	}
	
	
	else if(num1 == num2 && num3<num1) {
		System.out.println(num1 + " and" + num2 + " are equal");
	}
	else if(num2 == num3 && num1<num2) {
		System.out.println(num2 + " and" + num3 + " are equal");
	}
	else if (num1 == num3 && num2<num1) {
		System.out.println(num1 + "and" + num3 + " are equal");
	}
	
	
	else if(num1 > num2 && num1 > num3) {
		System.out.println(num1 + " is maximum");
	}
	else if(num2 > num1 && num2 > num3) {
		System.out.println(num2 + " is maximum");
	}
	else if(num3 > num1 && num3 > num2) {
		System.out.println(num3 + " is maximum");
	}


	else {
		System.out.println("Invalid inputs");
	}
	
	}
	
}
