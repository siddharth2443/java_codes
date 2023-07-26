class Core {
	public static void main(String[] args) {
	
		int arr[][] = new int[3][];

		arr[0] = new int[] {10,20,30};
		arr[1] = new int[] {40,50,60,70,80};
		arr[2] = new int[] {90,100};

		for(int x[] : arr) {
			for(int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
