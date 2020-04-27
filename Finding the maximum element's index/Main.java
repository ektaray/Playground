import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    	Scanner s = new Scanner(System.in);
    	int n;
    	n = s.nextInt();
    	 int a[] = new int[n];
    	for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            
        }
    

		int max = a[0];
		int index = 0;

		for (int i = 0; i < a.length; i++) 
		{
			if (max < a[i]) 
			{
				max = a[i];
				index = i;
			}
		}

		System.out.println(index);//Try your code here
  }
}