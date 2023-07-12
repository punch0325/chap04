
public class GugudanExample {

	public static void main(String[] args) {
		
//		for (int i = 0; i<=2; i++) {
//			for (int j=0; j<=2; j++) {
//				System.out.print("i 값 : " + i);
//				System.out.println("   j 값 : " + j);
//			}
//		}

		
		
		// 구구단 만들어보기
		int result = 0;
		for (int i = 2; i < 10; i++) {
			System.out.println(i+"단");
			for (int j = 1; j < 10; j++) {
				result = i * j ;
				System.out.printf("%d X %d = %2d\n" , i , j , result);
			}
			System.out.println();
		}
		
		
		
		//피타고라스의 정리
		int count = 0;
		for (int x=1; x<=100; x++)
			for (int y=1; y<=100; y++)
				for (int z=1; z<=100; z++) {
					
				}
					
		
		
		
		
		
		
		
	}

}
