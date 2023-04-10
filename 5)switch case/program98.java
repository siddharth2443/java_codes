class Core {
	public static void main(String[] args) {
	
		String str="nonveg";
		switch(str) {
			
			case "veg" :
				{
					String str1="starter";
					switch(str1) {
						case "starter" :
							System.out.println("paneer tikka");
							break;
						case "main" :
							System.out.println("butter paneer");
							break;
						default :
							System.out.println("invalid1");	
						}
					}
				break;

			case "nonveg" :
				{
					String str1="starter";
					switch(str1) {
						case "starter" :
							System.out.println("chicken tikka");
							break;
						case "main" :
							System.out.println("butter chicken");
							break;
						default :
							System.out.println("invalid2");
							break;
					}
				}
				break;
			default :
				System.out.println("invalid3");
				break;
			}	
	}
}
