import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int p=1,l=1,temp=num;
      int d,sum=0;
      while(num!=0)
      {
        p=p*10;
        l++;
        num/=10;
      }
      num=temp;
  for(int i=1;i<=l;i++)
  {
    d=num%10;
    sum=sum+(d*d*d);
    num=num/10;
      }
      if(temp==sum)
      System.out.println("Armstrong Number");
      else
         System.out.println("Not a Armstrong Number");
      
	}
}