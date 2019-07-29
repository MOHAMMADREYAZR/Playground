import java.util.Scanner;
class Main{

  public static void main(String[] args)
  {
 Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int p=1,l=1;
    int temp,diit;
    temp=num;
    while(num!=0)
    {
    p=p*10;
      num/=10;
      l++;
    }
    num=temp;
    p=p/100;
    diit=(num/p)%10;
    System.out.println(diit);
  }
}