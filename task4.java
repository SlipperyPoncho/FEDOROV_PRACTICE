//https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
  }
}