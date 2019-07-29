import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int rev=0;
    int i=3;
    while(i>0)
    {
      int digit=num%10;
      rev=rev*10+digit;
      num/=10;
      i--;
    }
    System.out.println(rev);
  }
}