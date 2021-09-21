
class GasStation {
	private int gas;
	
	void set_gas(int a) {
		gas = a;
	}
	
	void show() {
		System.out.println("현재 재고량: " + gas + "L");
	}
	
	int refuel(int g) { //메세지패싱
		if(gas<g) {
			return -1;
		}
		
		gas -=g;
		return g;
	}

}
