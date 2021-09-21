import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("실습과제");
		System.out.println("[menu]");
		System.out.println("0 : exit");
		System.out.println("1 : menu");
		System.out.println("2 : input(array)");
		System.out.println("3 : show(array)");
		System.out.println("4 : insert");
		
		int mode = 5, size = 10;
		int [] arr = new int [10];
		Scanner sc = new Scanner(System.in);
		while(mode != 0) {
			System.out.print("메뉴입력> ");
			mode = sc.nextInt();
			switch(mode) {
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
				
			case 1:
				System.out.println("[menu]");
				System.out.println("0 : exit");
				System.out.println("1 : menu");
				System.out.println("2 : input(array)");
				System.out.println("3 : show(array)");
				System.out.println("4 : insert");
				break;
				
			case 2:
				System.out.print("정수(개수, 값)> ");
				size = sc.nextInt();
				for(int i=0; i<size; i++) {
					arr[i] = sc.nextInt();
				}
				System.out.println("입력 완료");
				break;
				
			case 3:
				for(int i=0; i<size; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				break;
				
			case 4:
				System.out.println("삽입(index, 값)>");
				int index = sc.nextInt();
				int value = sc.nextInt();
				for(int i=size; i>index; i--) {
					arr[i] = arr[i-1];
				}
				arr[index] = value;
				size++;
				
				System.out.println("삽입 완료");
			
			}
		}
		
		sc.close();

	}
	
	

}
