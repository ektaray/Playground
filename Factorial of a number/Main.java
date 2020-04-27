import java.util.Scanner;
class Main{
	public static void main (String[] args){
        int fact=1;
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();// Type your code here
      for(int i=1;i<=num;i++)
      {
        fact=fact*i;
      }
      System.out.print(fact);
	}
}