
public class Exercise_04_14 {

	public static void main(String[] args) {
//		다음은 숫자맞추기 게임을 작성한 것이다 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다 
//		사용자가 값을 입력하면 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다 
//		사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다 프로그램을 완성하시오.


	
		// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
		int answer = (int)(Math.random()*100+1);
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		
		// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");  
			input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다
			if (answer > input) {
				System.out.println("땡 틀렸습니다! 입력한 숫자보다 더 큽니다.");
				System.out.println();
			}else if (answer < input) {
				System.out.println("땡 틀렸습니다! 입력한 숫자보다 더 작습니다.");
				System.out.println();
			}else {
				System.out.println("정답입니다!");
				break;
			}
		} while(true); // 무한반복문
		System.out.println("총 "+count+"번만에 맞췄습니다!^^");
		
	}

}
