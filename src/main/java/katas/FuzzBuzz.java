package katas;

/**
 * Created by L.x on 15-4-29.
 */
public class FuzzBuzz {
    public static String of(int number) {
        if (number % 3 == 0) {
            return "Fuzz";
        }
        return String.valueOf(number);
    }
}
