import java.util.Scanner;
class Main
{
  public static int sqr(int a)
  {
    int r=a*a;
    return r;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=sqr(n);
      System.out.print(a);
	} 
}