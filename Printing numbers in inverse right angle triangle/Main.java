import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      
      for (int i = n; i >= 1; i--)
		{
        int k=i;
			// Print '*' i times
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
              k--;
			}// Type your code here
        
        System.out.println(" ");
	}
}
}