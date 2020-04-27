import java.util.Scanner;

class Main {
	public static void main (String[] args) 
	{
      int num,a=0,b=0;
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();	
      while(num>=10)
      {
        a=num%10;
        num=num/10;
      }
      System.out.print(a);
    }
}
		