
public class ConversionSystem {

	public static void main(String[] args) {
		// Create binary numbers array
		int[][] binaryNumbers = new int[6][6];

		// Initialise binary numbers array
		for (int i = 0; i < binaryNumbers.length; i++) {
			for (int j = 0; j < binaryNumbers.length; j++) {
				binaryNumbers[i][j] = mGetRandomZeroOrOne();
			}
		}

		for (int i = 0; i < binaryNumbers.length; i++) {
			for (int j = 0; j < binaryNumbers.length; j++) {
				System.out.print(binaryNumbers[i][j]);
			}
			System.out.println(" = " + mConvertSystem(binaryNumbers, i));
		}

	}

	public static int mGetRandomZeroOrOne() {
		return (int) (Math.random() * 2);
	}

	public static int mConvertSystem(int[][] binaryNums, int rowNumber) {
		int deciamlNumber = 0;
		int multiplier = 1;

		for (int i = binaryNums.length - 1; i >= 0; i--) {
			deciamlNumber += (binaryNums[rowNumber][i] * multiplier);
			multiplier *= 2;
		}

		return deciamlNumber;
	}

}
