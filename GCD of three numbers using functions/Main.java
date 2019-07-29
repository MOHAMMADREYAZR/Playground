import java.util.Scanner;
public class Main{
  static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
	  int a1=gcd(a,b);
      int ans=gcd(a1,c);
      System.out.print(ans);
    }
}