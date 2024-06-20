//https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java
public class Maskify {
    public static String maskify(String str) {
        if (str.length() > 4) {
          return str.substring(0, str.length() - 4).replaceAll(".", "#") 
            + str.substring(str.length() - 4, str.length());
        } else return str;
    }
}