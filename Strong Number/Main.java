import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int temp=num;
      int digit,fact;
      int sum=0,p=1,l=1;
      while(num!=0)
      {
        p=p*10;
        l++;
        num/=10;
      }
      num=temp;
      for(int i=1;i<l;i++)
      {
      digit=num%10;
        fact=1;
        for(int j=1;j<=digit;j++)
        {
         fact=fact*j; 
        }
        sum=sum+fact;
        num/=10;
      }
      if(temp==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}