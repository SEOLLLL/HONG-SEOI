
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
			System.out.println("���� ���� �����մϴ�.");
		else {
			food += fd;
			money -= 2*fd;			
		}		
		
	}
	
	void show() {
		System.out.println("������ �ִ� ��: " + money + "�޷�");
		System.out.println("���� ����� ��: " + food + "g");
	}

}
