import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      int temp=1;
      for(int i=1;i<=num;i++)
      {
        for(int j=1;j<=(num-i);j++)
          System.out.print(" ");
        for(int m=1;m<=(i);m++)
        {System.out.print(temp+" ");
         temp++;
        }// Type your code here
        System.out.print("\n");
        
      }// Type your code here
    }    
}