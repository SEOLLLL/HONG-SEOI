package game;


public class Castle {
	private int strength; // ĸ��ȭ �� �ڷ����мӼ�
	
	public Castle(){}//default ������
	
	public Castle(int s){
		strength = s; //������ �����ε�
	}
	public void set_strength(int st) { //���� �޼ҵ�
		strength = st;
	}
	public int get_strength() {
		return strength;
	}
	
	public void show() {
		System.out.println("���� ������: " + strength);
		
	}
	public void destroy(int att) {
		strength -= att;
		if(strength<0)
			System.out.println("���� �Զ��Ǿ����ϴ�.�̤�");
		
	}

}

