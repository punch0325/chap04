
public class Exercise_04_1 {

	public static void main(String[] args) {
//		1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오

		//첫번째 방식
		int result = 0;
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				result += j;
			}
		}
		System.out.println("최종 값 : "+result);
		
		
		
		//두번째 방식
		result = 0;
		int sum = 0;
		for (int i=0; i<=10; i++) {
			sum+=i;
			result += sum;
		}
		System.out.println("최종 값 : "+result);
		
		
		
		
	}

}
