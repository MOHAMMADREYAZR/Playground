import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
	  int num= in.nextInt();
      int l=0,sum=0;
      int t=num;
      while(num!=0)
      {
        num=num/10;
      l++;
      }
      
    num=t;
      int s=num%10;
      sum=sum+s;
      int p=1;
      int a=1;
      while(a<l){
        p=10*p;
        a++;
      }
      s=num/p;
      sum=sum+s;
      System.out.println(sum);  
      // Type your code here
	}
}