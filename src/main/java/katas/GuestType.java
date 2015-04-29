package katas;

/**
 * Created by L.x on 15-4-29.
 */
public enum GuestType {
    MALE("Mr."), FEMALE("Ms."), KNIGHTED("Sir");
    private String callingName;

    GuestType(String callingName) {
        this.callingName = callingName;
    }

    public String callingName() {
        return callingName;
    }
}
