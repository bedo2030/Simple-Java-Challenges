import java.util.Scanner;

public class EqualMatrices {

	public static void main(String[] args) {
		// create value indicator
		int valueIndicator = 1;
		// create scanner to accept values from user
		Scanner scanner = new Scanner(System.in);
		// create 2 3x3 matrices
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
		// Initialise 1st matrix m1
		System.out.println("Enter values for 1st matrix: ");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				System.out.print("value #" + valueIndicator + " = ");
				m1[i][j] = scanner.nextInt();
				valueIndicator++;

			}
		}
		// Initialise 2nd matrix m2
		valueIndicator = 1;
		System.out.println("\nEnter values for 2nd matrix: ");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				System.out.print("value #" + valueIndicator + " = ");
				m2[i][j] = scanner.nextInt();
				valueIndicator++;

			}
		}

		// Check if both matrices are equal or not
		if (equals(m1, m2))
			System.out.println("Matrix #1 EQUALS Matrix #2");
		else
			System.out.println("Matrix #1 doesn't EQUAL Matrix #2");

	}

	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		return true;
	}

}
