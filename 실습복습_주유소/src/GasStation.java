
class GasStation {
	private int gas;
	
	void set_gas(int a) {
		gas = a;
	}
	
	void show() {
		System.out.println("���� ���: " + gas + "L");
	}
	
	int refuel(int g) { //�޼����н�
		if(gas<g) {
			return -1;
		}
		
		gas -=g;
		return g;
	}

}
