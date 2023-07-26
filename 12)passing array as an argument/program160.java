class Core {
	public static void main(String[] args) {
	
		int arr[] = {10,20,30};

		for(int x : arr) {
			System.out.println(x);
		}

		fun(arr);
	}

	static void fun(int arr[]) {
		System.out.println();
		
		for(int x:arr) {
			System.out.println(x);
		}
	}
}
