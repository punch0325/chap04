
public class TriangleExample {

	public static void main(String[] args) {
		
		System.out.println("<1번 별 찍기>");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		System.out.println("<2번 별 찍기>");
		for (int i=1; i<=5; i++) {
			for (int k=1; k<=i; k++) {
				System.out.print(" ");
			}
			for (int j=5; j >= i; j-- ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
	
		System.out.println("<3번 별 찍기>");
		for (int i=1; i<=5; i++) {
			for (int j=5; j >= i; j-- ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
	
		System.out.println("<4번 별 찍기>");
		for (int i=1; i<=5; i++) {
			for (int k=5; k>=i; k--) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}


		
		
		
		
		
		
		
	}

}
