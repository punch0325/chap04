
public class Exercise_04_10 {
	
	public static void main(String[] args) {	
//		int 타입의 변수 num이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라 
//		만일 변수 num의 값이 12345라면  ‘1+2+3+4+5’ 15 의 결과인 를 출력하라. 

	
		int num = 12345;
		int sum = 0;
		
		while (num > 0) {

			sum += num % 10; // 나머지를 구해 더한다.

			num /= 10; // 10으로 나눈다.

			System.out.println("num=" + num);
		}
		
		System.out.println("sum="+sum);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
