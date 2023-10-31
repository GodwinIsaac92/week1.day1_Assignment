package week2.day1A;

public class IsPrime {
	
	public void isPrime(int num) {
		boolean isPrime = false; 
		
		for (int i = 2; i <=num/2; i++) {
			if (num%i==0) {
				isPrime= true;
				break;
			}
		}
		if (!isPrime) {
			System.out.println(num + " is Prime Number.");
		}
		else {
			System.out.println(num + " is not Prime Number.");
		}
	}
	
	public static void main(String[] args) {
		
		IsPrime number = new IsPrime();
		number.isPrime(12);

	}
}

