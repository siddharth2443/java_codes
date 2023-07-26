class Core {
	private int jno = 0;
	private String name = null;

	Core(int jno, String name) {
		this.jno = jno;
		this.name = name;
	} 

	void info() {
		System.out.println(jno + " = " + name);
	}

	public static void main(String[] args) {
		Core obj = new Core(18, "Virat");
		obj.info();	
	}

}
