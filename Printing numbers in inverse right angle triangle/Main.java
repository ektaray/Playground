import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner scan = new Scanner(System.in);
      
      int num = scan.nextInt();
      int temp=num;
      for(int i=1;i<=temp;i++)
      {
        for(int j=num;j>=1;j--)
        System.out.print(j);
        	num=num-1;
        System.out.print("\n");
        
      } // Type your code here
	}
}