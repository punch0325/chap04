
public class BreakStatementExample {

	public static void main(String[] args) {
	
		// 랜덤메소드로 나온 num의 숫자까지만 합계 구하기 ! 
		int num = 0;
		int sum = 0;
		
		num = (int) (Math.random()*100+1);
		System.out.println("num : "+num);
		
		for (int i = 0; i <100; i++) {
			sum += i;
			if (i==num) 
				break; //break문은 즉시 반복을 끝낸다
			
		}
		System.out.println("합계 : "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
