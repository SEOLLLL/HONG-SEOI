
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("융합프로그래밍 과제 2016110838 홍서이");
		
		Owner SEOI = new Owner();
		Cat BORI = new Cat();
		
		SEOI.set_food(100);
		BORI.set_food(SEOI);
		BORI.eat(3);
		BORI.cat_grow();
		
		SEOI.show();
		BORI.show();
		
		SEOI.set_money(500);
		SEOI.buy_food(30);
		BORI.eat(12);
		BORI.cat_grow();
		
		SEOI.show();
		BORI.show();
				

	}

}
