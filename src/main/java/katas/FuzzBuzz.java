package katas;

/**
 * Created by L.x on 15-4-29.
 */
public class FuzzBuzz {
    public static String of(int number) {
        if (isBuzz(number)) {
            return "Buzz";
        }
        if (isFuzz(number)) {
            return "Fuzz";
        }
        return String.valueOf(number);
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static boolean isFuzz(int number) {
        return number % 3 == 0;
    }
}
