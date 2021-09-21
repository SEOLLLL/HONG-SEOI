
public class ex91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번
		int a = 5;
		System.out.print("1번 문제=");
		if(ex.odd(a))
			System.out.println("홀수");
		else
			System.out.println("짝수");
		//2번
		char c = 's';
		c = next(c);
		System.out.println("2번문제="+ c);
		
		//3번
		int [] data = {10,5,8,20,7,3,30,25,15};
		System.out.println("3번문제="+ ex.min(data));

	}
	
	//2번
	static char next(char ch) {
		return (char)(ch+1);
	}
	


}
