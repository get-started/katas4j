package katas;

/**
 * Created by L.x on 15-4-29.
 */
public class FuzzBuzz {
    public static String of(int number) {
        if (isFuzz(number)) {
            return "Fuzz";
        }
        return String.valueOf(number);
    }

    private static boolean isFuzz(int number) {
        return number % 3 == 0;
    }
}
