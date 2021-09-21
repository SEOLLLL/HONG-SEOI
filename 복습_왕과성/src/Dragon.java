import game.Castle;
class Dragon {
	private int power;
	void set_power(int po) {
		power = po;
	}
	
	void show() {
		System.out.println("현재 용의 파워: " + power);
	}
	
	//messsage passing by 객체인자전달
	void fire(Castle ca) {
		ca.destroy(power);
		
	}

}
