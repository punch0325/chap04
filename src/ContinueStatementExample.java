
public class ContinueStatementExample {

	public static void main(String[] args) {

		// (continue를 활용하여) 1~100 중에서 3의 배수의 합계와, 3의 배수가 아닌 것들의 합계를 구하기
		
		int sum1 = 0;   //3의 배수 합
		int sum2 = 0;  //나머지 합
		
		for (int i = 0; i <= 100; i++) {
			if(i%3==0) {
				sum1 += i;
				continue; // continue를 사용하면 그 아래의 statement는 실행되지 않고 다시 처음부터 반복된다는 뜻
			}
				sum2 += i;
		}

			System.out.println("3의 배수의 합계 : "+sum1);
			System.out.println("나머지의 합계 : "+sum2);
			
			
		
	}

}
