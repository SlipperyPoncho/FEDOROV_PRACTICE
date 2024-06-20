//https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;
        int power = 0;

        for (int i = binary.size() - 1; i >= 0; i--) {
            result += binary.get(i) * Math.pow(2, power);
            power++;
        }

        return result;
    }
}