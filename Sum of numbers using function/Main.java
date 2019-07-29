import java.util.Scanner;
class Main
{
  public static int sumof(int a)
  {
    int sum=0;
    for(int i=1;i<=a;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=sumof(n);
      System.out.print(a);
	} 
}