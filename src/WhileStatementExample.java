
public class WhileStatementExample {
	
	public static void main(String[] args) {
		
		int dice1 = 0 , dice2 = 0;
		int count = 0;
		
		do {
			dice1 = (int)(Math.random()*6+1);
			dice2 = (int)(Math.random()*6+1);
			System.out.print("dice1 = "+dice1+"    ");
			System.out.println("dice2 = "+dice2);
			count++;
		} while(dice1+dice2!=5);
		
		System.out.println("총 "+count+"번 던졌습니다 !");
		
	}
	
	public static void main2(String[] args) {
	
		int dice = 0;
		while (dice != 5) { 
			     //조건식의 값이 false가 되면 반복문이 끝난다. 
			dice = (int)(Math.random()*6+1);
			System.out.println("주사위 값 : "+dice);
		}
		System.out.println("End..");
	
	
	}

}
