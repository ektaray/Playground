import java.util.Scanner;
class Main{
	public static void func (int a){
      
      for(int i=2;i<=a;i++)
      {	int temp=0;
        for(int j=2;j<=i/2;j++)
        {  if(i%j==0)
          {temp=1;
           break;
          }
      }
      if (temp==0)
        System.out.print(i+"\n");
      }
    
      
	    // Type your code here
	}public static void main (String[] args){
	    Scanner scan = new Scanner(System.in);
      	int num = scan.nextInt();
      	func(num);
      	//System.out.print(ans);// Type your code here
    }
}