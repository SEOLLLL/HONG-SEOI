import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�ǽ�����");
		menu();
		
		King[] Joseon = new King[30];
		
		Scanner sc = new Scanner(System.in);
		String name;
		
		int mode = 5; 
		int size=0;
		
		while(mode!=0) {
			System.out.println("\n> ");
			mode = sc.nextInt();
			switch(mode) {
			case 0:
				System.out.println("����Ǿ����ϴ�");
				System.exit(0);
				break;
				
			case 1: //input
				System.out.print("�����̸�> ");
				name = sc.next();
				
				System.out.print("���� ����> ");
				int year = sc.nextInt();
				Joseon[size++] = new King(name, year);
				break;
			case 2: //show
				for(int i=0; i<size; i++) {
					Joseon[i].show();
				}
				break;
				
			case 3: //search
				System.out.print("�����̸�>");
				name = sc.next();
				for(int i=0;i<size;i++) {
					if(Joseon[i].getName().equals(name)){
						System.out.println("���Ǽ���>" + Joseon[i].getYear());
					}
					
					break;
				}
			
			case 4:
				menu();								
				break;
				
			}
		}
		
		
		sc.close();
		
		

	}
	
	private static void menu() {
		System.out.println("[ menu ]");
		System.out.println("0: exit");
		System.out.println("1: input(King info)");
		System.out.println("2: show(King list)");
		System.out.println("3: search(King name)");
		System.out.println("4: menu");
	}

}
