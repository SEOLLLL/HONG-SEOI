
class King {
	
	private String name; 
	private int year;
	
	King(){}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	void show() {
		System.out.println("����" + year + "���" + name);
	}
	
	King(String name, int year){
		this.name = name;
		this.year = year;
	}

	
}
