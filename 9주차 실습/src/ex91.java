
public class ex91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1��
		int a = 5;
		System.out.print("1�� ����=");
		if(ex.odd(a))
			System.out.println("Ȧ��");
		else
			System.out.println("¦��");
		//2��
		char c = 's';
		c = next(c);
		System.out.println("2������="+ c);
		
		//3��
		int [] data = {10,5,8,20,7,3,30,25,15};
		System.out.println("3������="+ ex.min(data));

	}
	
	//2��
	static char next(char ch) {
		return (char)(ch+1);
	}
	


}
