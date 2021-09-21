
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Message passing, Ä¸½¶È­, Á¢±ÙÁöÁ¤ÀÚ, package");
		
		Dragon Blue = new Dragon();
		Castle North = new Castle();
		
		Blue.set_power(20);
		North.show();
		
		Blue.fire(North);
		North.show();

	}

}
