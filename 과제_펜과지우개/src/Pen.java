
class Pen {
	
	private int paper;
	private int ink;
	
	void set_ink(int a) {
		ink = a;
	}
	
	void show() {
		System.out.println("현재 사용가능한 잉크량 : " + ink + "ml");
	}
	
	void write(int wr) {
			ink -= wr;
			if(ink<0)
				System.out.println("잉크가 부족합니다.");
					
		
	}

}
