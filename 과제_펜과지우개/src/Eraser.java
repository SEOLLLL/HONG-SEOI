
class Eraser {
	
	private int paper;
	private int weight;
	
	public Eraser() {}
	
	public Eraser(int a) {
		weight = a;
	}
	
	
	void set_eraser(int a) { //��밡���� ���찳�� Ƚ��
		weight = a;
	}
	
	void show() {
		System.out.println("���찳�� ��밡���� Ƚ��: " + weight + "ȸ");
	}
	
	void erase(Pen p) {
		p.write(paper);
	}

}
