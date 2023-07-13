
public class Exercise_04_2 {

	public static void main(String[] args) {
//		1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100 이상이 되는지 구하시오
		int i = 0;
		int sum = 0;
		boolean run = true;
		
		
		while(run) {
			if(sum < 100) {
				i++;
				if (i%2 != 0) {
					sum += i;          
				}else {   
					i = i * -1;
					sum += i;
					i = i * -1;
				}
			}else if(sum >= 100) {
				run = false;
			}
		}
		System.out.println(i);


	}

}
