
class Car {
	private int gas;
	
	void set_gas(int ga) {
		gas = ga;
	}
	
	void show() {
		System.out.println("현재 주유량은: " + gas + "L");
	}
	
	void fill_gas(int g, GasStation st) {
		if(g==st.refuel(g))
			gas += g;
		else
			System.out.println("주유실패");
		
	}
	
	
	


}
