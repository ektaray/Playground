import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int number, first_digit, last_digit;
		Scanner sc = new Scanner(System.in);
		
		
		number = sc.nextInt();	
		
		first_digit = number;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		
		last_digit = number % 10;
		
		System.out.print(first_digit+last_digit);
	}
}