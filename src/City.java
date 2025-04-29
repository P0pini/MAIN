import javax.swing.*;
import java.time.LocalTime;

public class City {
    private String name;
    private int timeZone;
    private double szerGeo;
    public LocalTime meanTime(LocalTime time){
        double ileSekDodac=(szerGeo/1800)*(12*60*60);
        return time.plusSeconds(ileSekDodac);
    }
}
