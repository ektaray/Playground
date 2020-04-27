import java.util.Scanner;
class Main{
  	public static void gret (int a,int b,int c){
      int temp;
      if(a>b)
      {temp=a;
       if(temp>c)
         temp=a;
       else
         temp=c;
      }
      else
      {
        temp=b;
        if(temp>c)
          temp=b;
        else
          temp=c;
      }
      System.out.print(temp);
    
      
        	
         
      
      
    }public static void main (String[] args){
	     Scanner scan = new Scanner(System.in);
      	int n1 = scan.nextInt();
      	int n2 = scan.nextInt();
      	int n3 = scan.nextInt();// Type your code here
      	gret(n1,n2,n3);
	}
}