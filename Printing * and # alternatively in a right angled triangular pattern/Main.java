import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		int temp=0;
  		Scanner scan = new Scanner(System.in);
     int num = scan.nextInt();
    for(int i=1;i<=num;i++)
    {
      for(int col=1;col<=i;col++)
      {
        if(temp==0)
        {  System.out.print("*");
         	temp=1;
        }
        else
        { System.out.print("#");
         temp=0;
        }
      }
      System.out.print("\n");
    }//Type your // Type your code here
    }
}