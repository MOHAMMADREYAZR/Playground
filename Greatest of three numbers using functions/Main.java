import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      greater(a,b,c);
	}
  public static int greater(int a,int b, int c)
  {
  if(a>=b&&a>=c)
  {
    System.out.print(a);
  }
   else if(b>=c)
     System.out.print(b);
    else
      System.out.print(c);
     return 0;
  }
 
  }
  
