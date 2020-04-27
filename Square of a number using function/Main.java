import java.util.Scanner;
class Main
{	public static int sqr (int m)
{
  int square=m*m;
  return square;
}
  
	public static void main (String[] args)
    {
	 Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      int l=sqr(num);
      System.out.print(l);// Type your code here   
	} 
}