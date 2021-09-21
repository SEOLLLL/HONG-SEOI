import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("실습과제");
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
				System.out.println("종료되었습니다");
				System.exit(0);
				break;
				
			case 1: //input
				System.out.print("왕의이름> ");
				name = sc.next();
				
				System.out.print("왕의 순서> ");
				int year = sc.nextInt();
				Joseon[size++] = new King(name, year);
				break;
			case 2: //show
				for(int i=0; i<size; i++) {
					Joseon[i].show();
				}
				break;
				
			case 3: //search
				System.out.print("왕의이름>");
				name = sc.next();
				for(int i=0;i<size;i++) {
					if(Joseon[i].getName().equals(name)){
						System.out.println("왕의순서>" + Joseon[i].getYear());
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
