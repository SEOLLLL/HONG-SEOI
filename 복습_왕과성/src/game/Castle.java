package game;


public class Castle {
	private int strength; // 캡슐화 중 자료은닉속성
	
	public Castle(){}//default 생성자
	
	public Castle(int s){
		strength = s; //생성자 오버로딩
	}
	public void set_strength(int st) { //설정 메소드
		strength = st;
	}
	public int get_strength() {
		return strength;
	}
	
	public void show() {
		System.out.println("현재 내구력: " + strength);
		
	}
	public void destroy(int att) {
		strength -= att;
		if(strength<0)
			System.out.println("성이 함락되었습니다.ㅜㅠ");
		
	}

}

