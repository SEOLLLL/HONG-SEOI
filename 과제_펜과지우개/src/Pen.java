
class Pen {
	
	private int paper;
	private int ink;
	
	void set_ink(int a) {
		ink = a;
	}
	
	void show() {
		System.out.println("���� ��밡���� ��ũ�� : " + ink + "ml");
	}
	
	void write(int wr) {
			ink -= wr;
			if(ink<0)
				System.out.println("��ũ�� �����մϴ�.");
					
		
	}

}
