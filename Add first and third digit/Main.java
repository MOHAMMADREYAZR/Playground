import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in= new Scanner(System.in);
      int num=in.nextInt();
      int digit1=(num%10);
      int digit2=(num/100)%10;
      System.out.println(digit1+digit2);
	}
}