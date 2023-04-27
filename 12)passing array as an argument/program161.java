class Core {
	public static void main(String[] args) {
	
		int arr[] = {100,200,300,400};

		fun(arr);

		for(int x:arr) {
		
			System.out.println(x);
		}
	}

	static void fun(int[] arr) {
		
		for(int x:arr) {
			System.out.println(x);
		}

		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]+50;
		}
	}
}
