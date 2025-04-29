import java.time.LocalTime;

public abstract class Clock {
    private LocalTime time;

    public void setTime(int h, int m, int s){
        if(h>=24 || h<=0){
            throw new IllegalStateException("Godzina nie jest w zakresie");
        }
        if(h>=60 || h<=0){
            throw new IllegalStateException("Minuta nie jest w zakresie");
        }
        if(h>=60 || h<=0){
            throw new IllegalStateException("Sekunda nie jest w zakresie");
        }
        this.time=(LocalTime.of (h,m,s));
    }
    public String  toString(){
        return String.format("%02d:%02d:%02d",time.getHour(),
                time.getMinute(), time.getSecond());
    }
}
