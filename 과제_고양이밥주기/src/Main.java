
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�������α׷��� ���� 2016110838 ȫ����");
		
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
