
public class SwitchStatementExample {

	public static void main(String[] args) {
		
		
		int num1 = (int)(Math.random()*5);
				
//				if (num1 == 0)
//					System.out.println("도");
//				else if (num1 == 1)
//					System.out.println("개");
//				else if (num1 == 2)
//					System.out.println("걸");
//				else if (num1 == 3)
//					System.out.println("윷");
//				else
//					System.out.println("모");
					
				

				char ch = 0;
				/* switch문은 동등 비교만 하기 때문에 모든 else if문을 switch문으로 바꿀 수는 없지만, 
				     모든 switch문을 else if문으로 바꿀 수는 있다*/
				switch (num1) {
				case 0:
					ch = '도';
					break;
				case 1:
					ch = '개';
					break;
				case 2:
					ch = '걸';
					break;
				case 3:
					ch = '윷';
					break;
				case 4:
					ch = '모';
					break;
				default:
					break;
				}
//				System.out.println(num1 + " : " + ch);
				
				
				
				char cha = (char)(Math.random()*26 +'A');
				System.out.println(cha);
				
//				switch문은 break가 걸릴 때 까지 해당 case가 참이라면 statement를 실행하므로 아래와 같이 사용할 수도 있다
				switch (cha) {
				case 'A' :
				case 'I' :
				case 'E' :
				case 'O' :
				case 'U' :
					System.out.println("모음");
					break;
				default:
					System.out.println("자음");
					break;
				}
				
	}

}
