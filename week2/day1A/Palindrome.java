package week2.day1A;

public class Palindrome {
    public void PalinNum(int num) {
        int Num1, reverse = 0;
        int Palindrome = num;
        for(; num != 0; num /= 10) {
        	Num1 = num % 10;
            reverse = (reverse * 10) + Num1;
        }
        if (Palindrome == reverse) {
            System.out.println(Palindrome + " is a Palindrome.");
        } else {
            System.out.println(Palindrome + " is not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.PalinNum(121);
        obj.PalinNum(12345);
    }
}

