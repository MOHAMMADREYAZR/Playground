import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
      int i=1;
		for(int row_no = 1 ; row_no <= n ; row_no++){
			for(int space = 1 ; space <= (n-row_no) ; space++ ) {
				System.out.print(" ");
			}
			for(int col_no = 1 ; col_no <= i ; col_no++){
				System.out.print("*");
			}
          i=i+2;
			System.out.print("\n");			
		}
	}
}

