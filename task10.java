//https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java
class Diamond {
  public static String print(int n) {
    if (n <= 0 || n % 2 == 0) {
            return null;
        }
        StringBuilder diamond = new StringBuilder();
        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++) {
                diamond.append(" ");
            }
            for (int j = 0; j < i; j++) {
                diamond.append("*");
            }
            diamond.append("\n");
        }
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 0; j < (n - i) / 2; j++) {
                diamond.append(" ");
            }
            for (int j = 0; j < i; j++) {
                diamond.append("*");
            }
            diamond.append("\n");
        }
        return diamond.toString();
	}
}