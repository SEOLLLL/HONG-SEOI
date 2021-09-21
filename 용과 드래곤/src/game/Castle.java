package game;

class Castle {
	private int strength; //캡슐화
	
	public Castle() {}
	
	public Castle(int s) { //생성자 오버로딩
		strength = s;
	}
	
	public int set_strength() {
		return strength;
	}
	
	public void show() {
		System.out.println("현재내구력: " + strength);
	}
	
	public void destroy(int att) {
		strength -= att;
		if(strength<0)
			System.out.println("성이 함락되었습니다.");
	}
	

}
