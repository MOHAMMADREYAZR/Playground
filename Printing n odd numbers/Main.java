import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=1;
      int a=2*n;
      for(int i=1;i<=a;i++)
      {
      if(i%2==1 && count<=n)
      {
        System.out.println(i);
        count++;
      }
      }  // Type your code here
	}
}