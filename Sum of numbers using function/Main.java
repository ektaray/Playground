import java.util.Scanner;
class Main{
  public static int sum(int m)
{	int sum=0;
  for(int i=1;i<=m;i++)
  {
    sum=sum+i;
  }
  return sum;
}
  
	public static void main (String[] args){
	     Scanner scan = new Scanner(System.in);
      	 int num = scan.nextInt();
      	int ans=sum(num);
      	System.out.print(ans);
// Type your code here
	}
}