
class Owner {
	
	private int food;
	private int money;
	
	void set_food(int a) {
		food = a;
		
	}
	
	void set_money(int d) {
		money = d;
	}
	
	void feed(int b, Cat c) {		
		c.eat(food);
		food -= b;
	}
	
	void buy_food(int fd) {
		
		if(money<2*fd)
			System.out.println("가진 돈이 부족합니다.");
		else {
			food += fd;
			money -= 2*fd;			
		}		
		
	}
	
	void show() {
		System.out.println("가지고 있는 돈: " + money + "달러");
		System.out.println("남은 사료의 양: " + food + "g");
	}

}
