class Core {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40};

		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));

		Core obj = new Core();

		obj.fun(arr);

		for(int x:arr) {
			System.out.println(x);
		}

		int x=50;
		int y=60;

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
	}

	void fun(int arr[]) {
		
		arr[1]=50;
		arr[2]=60;
	}
}
