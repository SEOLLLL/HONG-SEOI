import game.Castle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Message passing, ĸ��ȭ, ����������, package");
		
		Dragon Blue = new Dragon();
		Castle North = new Castle();
		
		Blue.set_power(20);
		North.show();
		
		Blue.fire(North);
		
		//���� ���� �����Ѵ� -> message passing(ȣ�����)
		// Blue.fire(North); Blue ��� ��ü�� fire�� �Ѵ�
		
		North.show(); //������ 10
		
		
		/*Castle North = new Castle(30); //������ �����ε��� defalut �����ε� �����
		 
		
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
