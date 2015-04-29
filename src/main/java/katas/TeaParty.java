package katas;

/**
 * Created by L.x on 15-4-29.
 */
public class TeaParty {
    public static String welcome(String whom, GuestType guestType) {
        return String.format("Hello %s %s", guestType.callingName(), whom);
    }

}
