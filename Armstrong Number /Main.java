import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   int c=0,a,temp;  
    Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();//It is the number to check armstrong  
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("Armstrong Number");   
    else  
        System.out.println("Not a Armstrong Number"); // Type your code here
	}
}