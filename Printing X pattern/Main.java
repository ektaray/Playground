import java.util.Scanner;
class Main {
	public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();	
      	for(int i=1;i<=n;i++)
        {
          	for(int j=1;j<=n;j++)
            {
              if((j==i)||(j==n+1-i))
                System.out.print("*");
              else
                System.out.print(" ");
            }
          System.out.print("\n");
        }
          // Type your code here
	}
}