import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
      	 int n1 = scan.nextInt();
      	int n2 = scan.nextInt();
      int n3 = scan.nextInt();
      if(n1>n2)
      {
        if(n1>n3)
           System.out.print(n1);
        else
          System.out.print(n3);
      }
      else
      { if(n2>n3)
        System.out.print(n2);
       else
          System.out.print(n3);
      }
       
        

        
// Type your code here
    }
}