
class Eraser {
	
	private int paper;
	private int weight;
	
	public Eraser() {}
	
	public Eraser(int a) {
		weight = a;
	}
	
	
	void set_eraser(int a) { //사용가능한 지우개의 횟수
		weight = a;
	}
	
	void show() {
		System.out.println("지우개의 사용가능한 횟수: " + weight + "회");
	}
	
	void erase(Pen p) {
		p.write(paper);
	}

}
