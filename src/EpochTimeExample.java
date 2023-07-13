
public class EpochTimeExample {

	public static void main(String[] args) {
	
		long epoch = System.currentTimeMillis()/1000 + 9*60*60;
		
		int year = 1970;
		for (; ;) {
			boolean isLeap = (year%4==0 && year%100!=0) || (year%400==0);
			
			int dayOfYear = isLeap ? 366 : 365;
			
			if (epoch - dayOfYear*24*60*60 >=0) {
				epoch = epoch -dayOfYear*24*60*60;
				year++;
				continue;
			}
			break;
		}
		
		System.out.println(year);

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
