public class DigitalClock(Clock extend Clock) {
    public enum ClockType{
        H24,H12;


    }
    private ClockType type;
    public DigitalClock(ClockType type) {
        this type = type;
    }
}
