import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   int a,fact,sum=0,temp;
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      temp=num;
      while(num>0)
      {
        fact=1;
        a=num%10;
        num=num/10;
        for(int i=1;i<=a;i++)
        {
          fact=fact*i;
        }
        sum=sum+fact;
      }
      if(sum==temp)
        System.out.print("Yes");
      else
        System.out.print("No");
        
        
        
        // Type your code here
	}
}