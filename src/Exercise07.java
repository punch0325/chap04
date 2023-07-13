import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		int money = 0;
		
		
		Scanner scan = new Scanner(System.in);
		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("       1. 예금   2. 출금    3. 잔고    4.종료        ");
			System.out.println("------------------------------------------------------");
			
			System.out.print("번호를 입력해주세요 > ");
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				System.out.print("예금액을 입력해주세요 : ");
				money = scan.nextInt();
				balance += money;
				break;
			case 2:
				System.out.print("출금액을 입력해주세요 : ");
				money = scan.nextInt();
				balance -= money;
				break;
			case 3:
				System.out.println("잔액은 "+balance+"원 입니다.");
				break;
			case 4:
				System.out.println("이용해주셔서 감사합니다.");
				run = false;
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다. 1번~4번까지 중 선택해주세요.");
				break;
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
