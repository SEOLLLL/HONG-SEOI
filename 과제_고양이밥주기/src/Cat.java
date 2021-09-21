
class Cat {
	
	private int food;
	private int growth = 0;
	
	
	void set_food(Owner ow) {
		ow.set_food(food);
	}
	
	void eat(int b) {
		food += b;
		if(food<0)
			System.out.println("사료가 부족합니다.");
		
	}
	
	void cat_grow() {
		for(int i=0; i<food; i++)
			growth += 1;
		
	}
	
	void show() {
		System.out.println("고양이가 먹은 사료양: " + food + "g");
		System.out.println("고양이의 성장도: " + growth + "mm");
	}

}
