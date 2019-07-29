import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner (System.in);
    int n=in.nextInt();
    int ar[]=new int[n];
    for (int i=0;i<n;i++)
      ar[i]=in.nextInt();
    int max=0;
    int a=1;
    for(int i=0;i<n;i++)
    {
     if(ar[i]>max)
     {
       max=ar[i];
       a=i;
     }
    }
    System.out.print(a);
  }
}