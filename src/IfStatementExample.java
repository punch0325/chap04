import java.util.Scanner;

public class IfStatementExample {

	public static void main(String[] args) {
		//리눅스에서 print 메소드 자동 완성 단축키는 Alt + /이다. (단축키 바꾸는 것도 가능 나중에 구글링 해볼 것)
		
		System.out.println("Hello, Lynux");
		
		int num = 105;
		//if 조건문 
		if (num%2==0) {
			System.out.println("####");
			System.out.println(num + " : 짝수입니다.");
			
		}else {
			System.out.println("####");
			System.out.println(num + " : 홀수입니다.");
		}
		
		
		int number1 = 95;
		//if 문에서 블럭에 들어가 있는 statement가 1줄이면 {}를 생략 할 수 있음
		if (number1%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
			
	
		//if ~ else if 조건문
		int number2 = (int)(Math.random()*15-5);
		System.out.println("number2 = "+number2);
		
		if (number2>0) {
			System.out.println("양수");
		}else if (number2<0) {
			System.out.println("음수");
		}else {
			System.out.println("당첨! 0입니다.");
		}
		
		
		
		// 학점 계산기 
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 ▶ ");
		int score = scan.nextInt();
		
		if (score < 101 && score > 89) 
			System.out.println("A학점입니다.");
		else if (score < 90 && score > 79 )
			System.out.println("B학점입니다.");
		else if (score < 80 && score > 49)
			System.out.println("C학점입니다.");
		else if (score < 50 && score >= 0 ) 
			System.out.println("F학점입니다. 재수강하세요.");
		else 
			System.out.println("점수를 잘못 입력하셨습니다. 다시 입력하세요.");
	}

}
