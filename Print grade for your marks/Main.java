import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
      	int num = scan.nextInt();
      	if(num>=85)
           System.out.print("A");
      	else if(num>=75)
          System.out.print("B");
      	else if(num>=65)
         System.out.print("C");
        
      else if(num>=55)
         System.out.print("D");
          else if(num>=45)
             System.out.print("E");
            else 
               System.out.print("Fail");
          
        
      	// Type your code here
    }
}