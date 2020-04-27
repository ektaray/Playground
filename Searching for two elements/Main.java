import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
      	int count1=0,count2=0;
      	int num1 = scan.nextInt();
      	int num2[]=new int[5];
      	for(int i=0;i<=4;i++)
        {
          	num2[i] = scan.nextInt();
        }
      	int num3 = scan.nextInt();
      	int num4 = scan.nextInt();
      int flag=0;
      	for(int i=0;i<=4;i++)
        {	
          if(num3==num2[i])
          {
            count1=i;
            flag=1;
            break;
          }
          
        }
      	if(flag==0)
         	count1=-1;
       int flag1=0;
      	for(int i=0;i<=4;i++)
        {	
          if(num4==num2[i])
          {
            count2=i;
            flag1=1;
            break;
          }
          
        }
      	if(flag1==0)
         	count2=-1;
      System.out.print(count1+"\n");
       System.out.print(count2+"\n");
      
      
      
      	
    }
}