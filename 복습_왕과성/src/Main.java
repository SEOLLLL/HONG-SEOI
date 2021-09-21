import game.Castle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Message passing, 캡슐화, 접근지정자, package");
		
		Dragon Blue = new Dragon();
		Castle North = new Castle();
		
		Blue.set_power(20);
		North.show();
		
		Blue.fire(North);
		
		//용이 성을 공격한다 -> message passing(호출관계)
		// Blue.fire(North); Blue 라는 객체가 fire을 한다
		
		North.show(); //내구력 10
		
		
		/*Castle North = new Castle(30); //생성자 오버로딩시 defalut 오버로딩 사라짐
		 
		
		//North.strength = 30;
		North.set_strength(30);
		
		//System.out.println(North.trength);
		System.out.println(North.get_strength());
		
		Dragon Blue = new Dragon();
		Blue.set_power(20);
		Blue.show();
		*/

	}

}
