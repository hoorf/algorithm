package bigNumberCount;

import java.util.Arrays;

/**
 * 经典算法案例，阶乘问题 n!=1*2*3*4.....*n,数字精度问题
 * 
 * @author Administrator
 *
 */
public class CountMethod {

	/**
	 * 先让每一位相乘，完成后再进行进位
	 * 
	 * @param result
	 * @param number
	 * @return
	 */
	public static int[] multi(int[] result, int number) {

		// 相乘
		for (int i = 0; i < result.length; i++) {
			result[i] *= number;
		}
		// 进位
		for (int i = result.length - 1; i > 0; i--) {
			result[i - 1] += result[i] / 10;
			result[i] = result[i] % 10;
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] result = new int[200];
		result[result.length - 1] = 1;
		for (int i = 1; i <= n; i++) {
			result = multi(result, i);
		}
		System.out.println(Arrays.toString(result).replaceAll("\\[(0,\\s)*|\\s|,|\\]", ""));
	}

}
