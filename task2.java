//https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java
import java.util.Arrays;
public class Kata {
  public static int findEvenIndex(int[] arr) {
    	int result = -1;
	for (int i = 1; i <= arr.length - 1; i++) {
		int[] left = new int[i];
      		int[] right = new int[(arr.length - 1) - i];
		System.arraycopy(arr, 0, left, 0, i);
		System.arraycopy(arr, i + 1, right, 0, (arr.length - 1) - i);
		if (Arrays.stream(left).sum() == Arrays.stream(right).sum()) {
			result = i;
		}
	}
	return result;
  }
}