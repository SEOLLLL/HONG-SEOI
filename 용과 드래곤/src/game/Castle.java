package game;

class Castle {
	private int strength; //ĸ��ȭ
	
	public Castle() {}
	
	public Castle(int s) { //������ �����ε�
		strength = s;
	}
	
	public int set_strength() {
		return strength;
	}
	
	public void show() {
		System.out.println("���系����: " + strength);
	}
	
	public void destroy(int att) {
		strength -= att;
		if(strength<0)
			System.out.println("���� �Զ��Ǿ����ϴ�.");
	}
	

}
