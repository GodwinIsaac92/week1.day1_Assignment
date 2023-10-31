package week2.day1A;

public class Fibonacci {

	public static void main(String[] args) {
		
		int num=0,fstnum=1,secnum,count=8;
		System.out.println(num +" " + fstnum);
		
		for (int i = 2; i < count; i++) {
			
			secnum = num + fstnum;
			System.out.println(" " + secnum);
			num=fstnum;
			fstnum = secnum;
			
		}

	}

}
