import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int d,sum=0;
      while(n!=0)
      {
      d=n%10;
        sum=sum+d;
      n/=10;
      }
      System.out.println(sum);
	}
}