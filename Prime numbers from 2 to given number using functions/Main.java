import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      prime(n);
      
	}
  public static int prime(int num)
 {
    
  for(int i=1;i<=num;i++)
  {
    int count=0;
    for(int j=1;j<=i;j++)
    {
  if(i%j==0)
    count++;
  }
    if(count==2)
    {
    
      System.out.print(i);
      System.out.println(" ");
   }
    
  }
  return 0;
  }
  
}