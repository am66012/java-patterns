import java.util.Scanner;
public class Pattern3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the no. upto which you want to print the pattern");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
