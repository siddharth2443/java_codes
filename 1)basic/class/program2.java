class Core {
	
	public static void main(String[] args) {
		
		byte var1 = 12;
		byte var2 = 8;

		var1 = var1 + var2;

		System.out.println(var1);
		System.out.println(var2);
	}
}

//Error: Number generated at runtime is by default integer.
//
//after addition the number generated at runtime will be integer and can't be stored in byte datatype
