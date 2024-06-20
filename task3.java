//https://www.codewars.com/kata/5727bb0fe81185ae62000ae3/train/java
public class BackspacesInString {
  public String cleanString(String s) {
    StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
  }
}