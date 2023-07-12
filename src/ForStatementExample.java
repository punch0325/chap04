
public class ForStatementExample {

	public static void main(String[] args) {

//		int i = 0;
//		for (i = 1; i <=10; i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println("최종 i 값 : "+i);

	
		//무한 루프 
//		for (;;) 
//			System.out.println("...");
	
		
		// 1 ~ 10까지의 합계 구하기
//		int sum = 0;
//		int i = 0;
//		for (i = 1; i < 11; i++ ) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
//		System.out.println("최종 i 값 : "+i);
		
		
		//짝수들의 합과 홀수들의 합을 구하기
		int i = 0;
		int evenSum = 0; //짝수
		int oddSum = 0;  //홀수
		for (i = i; i<=100; i++) {
			if (i % 2 == 0) {
				evenSum += i ;
			}else {
				oddSum += i;
			}
		}
		System.out.println("짝수의 합 : "+evenSum);	
		System.out.println("홀수의 합 : "+oddSum);
		
	}

}
