//https://www.codewars.com/kata/54b81566cd7f51408300022d/train/java
import java.util.Arrays;

class WordSearch {
  static String[] findWord(String x, String[] y){
    final String xLower = x.toLowerCase();
    String[] searchResults = Arrays.stream(y)
                                   .filter(s -> s.toLowerCase().contains(xLower))
                                   .toArray(size -> new String[size]);
    return searchResults.length > 0 ? searchResults : new String[] {"Empty"};
  }
}