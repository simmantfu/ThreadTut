
public class Ilsand {

	 static int M[][]=  new int[][] 
	           {{1, 1, 0, 0, 0},
	            {0, 1, 1, 0, 1},
	            {1, 0, 1, 1, 1},
	            {0, 0, 0, 0, 0},
	            {1, 0, 1, 0, 1}
	           };
	           
	
	public static int identuFyisland() {
		int finalcount = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if (i != 0) {

					if (i != 4) {
						int count = 0;

						if (j != 0) {
							if (j != 4) {

								if (M[i][j] == 1)
									count = getnumberAgges(i, j);
							}
						}

						finalcount = finalcount + count;
					}

				}
			}

		}

		return finalcount;

	}

	public static int getnumberAgges(int row, int col) {

		int count = 0;
		System.out.println("row : " + row + " col : " + col);
		if ((M[row - 1][col - 1] == 1) || (M[row - 1][col] == 1) || (M[row - 1][col + 1] == 1)) {
			count++;
		}

		if ((M[row][col - 1] == 1) || (M[row][col] == 1) || (M[row][col + 1] == 1)) {
			count++;
		}

		if ((M[row + 1][col - 1] == 1) || (M[row + 1][col] == 1) || (M[row + 1][col + 1] == 1)) {
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(identuFyisland());
	}

}
