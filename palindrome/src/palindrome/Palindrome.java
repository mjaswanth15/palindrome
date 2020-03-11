package palindrome;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("your value 212 is "+ palindrome(212)+" (palindrome)");
		System.out.println("your value -242 "+palindrome(-242)+" (palindrome)");
		System.out.println("your value 237 "+palindrome(237)+" (not palindrome)");
	}
	public static boolean palindrome(int number) {
		int reverse = 0;
	    int pal = number;
	    while(number != 0){
	    int lastdigit = number%10;
	    reverse = (reverse * 10) + (lastdigit); 
	    number = number/10;
	    }
	    if ( pal == reverse)
	     return true;
	    else 
	    return false;
	    }
	}
