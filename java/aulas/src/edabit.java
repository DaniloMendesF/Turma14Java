import java.util.Scanner;

public class edabit {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		int [][] squarePatch = new int [n][n];
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				squarePatch [i][j] = n;
			}
		}
		System.out.println(squarePatch);
	}
}
