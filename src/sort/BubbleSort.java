package sort;

import java.util.Arrays;

public class BubbleSort {

	/**
	 * ц╟ещеепР
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] source = new int[] { 10, 5, 15, 6, 15, 78, 12, 3, 1, 5, 7, 1, 8, 5, 4, 6, 1, 8, 1, 5, 45, 4, 54, 5, 45, 4,
				54, 5, 4, 122, 12, 1, 21, 2, 654, 64, 64, 6 };
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length - 1 - i; j++) {
				if (source[j] > source[j + 1]) {
					int swap = source[j + 1];
					source[j + 1] = source[j];
					source[j] = swap;
				}
			}
		}
		System.out.println(Arrays.toString(source));
	}

}
