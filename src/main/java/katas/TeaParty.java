package katas;

/**
 * Created by L.x on 15-4-29.
 */
public class TeaParty {
    public static String welcome(String whom, GuestType guestType) {
        return String.format("Hello %s %s", name(guestType), whom);
    }

    private static String name(GuestType guestType) {
        switch (guestType) {
            case MALE:
                return "Mr.";
            case KNIGHTED:
                return "Sir";
            case FEMALE:
                return "Ms.";
            default:
                throw new IllegalArgumentException();
        }
    }
}
