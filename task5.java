//https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023/train/java
public class ZywOo {
  public static boolean validateUsr(String s) {
    return s.matches("[a-z_\\d]{4,16}");
  }
}