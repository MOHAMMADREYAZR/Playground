import java.util.Scanner;
class Main
{
  public static int powerfn(int base,int exp)
{
int ans=1;
for(int i=1;i<=exp;i++)
{
ans=ans*base;
}
return ans;

}
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int b=in.nextInt();
int e=in.nextInt();
int a=powerfn(b,e);
System.out.print(a);
}

}