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
      int g=0;
      
      for(int i=0;i<=4;i++)
        {
          	if(num2[i]>g)
              g=num2[i];
        }
      System.out.print(g);
      
      // Type your code here
    }
}