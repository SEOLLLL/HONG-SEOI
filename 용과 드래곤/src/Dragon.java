
class Dragon {
	private int power;
	void set_power(int po) {
		power = po;
	}
	
	void show() {
		System.out.println("현재 용의 파워: " + power);
	}
	
	//message passing
	void fire(Castle ca) {
		ca.destroy(power);
	}

}
