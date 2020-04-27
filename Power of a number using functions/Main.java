import java.util.Scanner;
class Main{
	public static int func (int a,int b){
      int ans=1;
      for(int i=1;i<=b;i++)
      {
        ans=ans*a;
      }
      return ans;
	    // Type your code here
	}public static void main (String[] args){
	    Scanner scan = new Scanner(System.in);
      	int num = scan.nextInt();
      	
      	int pow = scan.nextInt();
      	int ans=func(num,pow);
      	System.out.print(ans);// Type your code here
	}
}