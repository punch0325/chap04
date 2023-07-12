import java.util.Scanner;

public class Exercise_04 {

	private static final Object yes = null;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
	
// [4 - 1]
		
		// 1)
		System.out.print("1번) 숫자를 입력하세요 : ");
		int x = scan.nextInt();
		
		if (x>10 && x<20)
			System.out.println("'참' 입니다.");
		else 
			System.out.println("'거짓' 입니다.");
	
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
	
	
		// 6)
		System.out.print("6번) 숫자를 입력하세요 : ");
		int year = scan.nextInt();
		
		if (year%400==0 || year%4!=0 && year%100!=0) 
			System.out.println("'참' 입니다.");
		else 
			System.out.println("'거짓' 입니다.");
		
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		
		
		// 7)
		boolean powerOn = false;
		System.out.println("7번) 전원을 켜시겠습니까 ? : ");
		String onOff = scan.next();
		
		if (onOff.equals("on")){
			powerOn = true;
			if (powerOn) 
				System.out.println("전원이 켜졌습니다.");
			else 
				System.out.println("전원을 작동하지 않습니다.");
			
		}else if (onOff.equals("off")){
			System.out.println("전원을 끕니다.");
		}else {
			System.out.println("잘 못 입력하셨습니다. on / off 중에서 입력해주세요.");
		}
		
		
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
	
		
		// 8)
		System.out.print("8번) 글자를 입력하세요 : ");
		String str = scan.next();
		
		if (str.equals("yes"))
			System.out.println("'참' 입니다.");
		else 
			System.out.println("'거짓' 입니다.");
	}

}
