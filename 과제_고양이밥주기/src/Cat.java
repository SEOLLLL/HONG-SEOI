
class Cat {
	
	private int food;
	private int growth = 0;
	
	
	void set_food(Owner ow) {
		ow.set_food(food);
	}
	
	void eat(int b) {
		food += b;
		if(food<0)
			System.out.println("��ᰡ �����մϴ�.");
		
	}
	
	void cat_grow() {
		for(int i=0; i<food; i++)
			growth += 1;
		
	}
	
	void show() {
		System.out.println("����̰� ���� ����: " + food + "g");
		System.out.println("������� ���嵵: " + growth + "mm");
	}

}
