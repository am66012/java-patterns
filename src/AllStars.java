import java.util.Scanner;
public class AllStars {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. of lines you want to print the pattern");
		int n = scn.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
