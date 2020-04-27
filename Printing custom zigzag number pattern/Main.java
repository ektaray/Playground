import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();	
      	for(int i=1;i<=n;i++)
        {	int temp=i;
          	for(int j=1;j<=n;j++)
            {	if(j!=1&&j!=n)
              	System.out.print(i);
             	else if((j==n)&&(i%2==1))
                  System.out.print(temp+1);
             	else if((j==1)&&(i%2==0))
                  System.out.print(temp+1);// Type your code here
             else if((j==n)&&(i%2==0))
                  System.out.print(i);
             	else if((j==1)&&(i%2==1))
                  System.out.print(i);
            }
         System.out.print("\n");
        }
	}
}