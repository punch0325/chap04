
public class Exercise_04_9 {

	public static void main(String[] args) {
//		숫자로 이루어진 문자열 str이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
//		만일 문자열이  "12345" 라면  ‘1+2+3+4+5’ 결과인 15를 출력이 출력되어야 한다 알맞은 코드를 넣으시오 .


		String str = "12345";
		int sum = 0;
		
		for(int i=0; i < str.length(); i++) {
			char ch = (char) (str.charAt(i) - '0');
			sum = sum + ch;
		}
		
		System.out.println("sum="+sum);

		//str.length() 메소드 : String 타입의 길이를 알려주는 메소드
		//str.charAt() 메소드 : String 타입의 해당 자릿수 글자를 알려주는 메소드 
	
		
		
		
		
	
	
	
	
	
	
	}

}
