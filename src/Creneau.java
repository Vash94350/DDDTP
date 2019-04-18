import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Creneau {
    private Date date;
    private String startHour;
    private String endHour;
    private double duration;

    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    public Creneau(Date date, double duration) throws StartHourAfterEndHourException
    {
        if(duration < 0)
            throw new StartHourAfterEndHourException("La durée du créneau ne peut pas être négative.");
        this.date = date;
        this.startHour = sdf.format(date);
        this.endHour = sdf.format(date.getTime() + duration*3600000);
        this.duration = duration;
    }

    public void printCreneau() {
        System.out.println("Date : " + date.toString() + ", heureDébut : " + startHour + ", heureFin : " + endHour);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creneau creneau = (Creneau) o;
        return Objects.equals(date, creneau.date) &&
                Objects.equals(startHour, creneau.startHour) &&
                Objects.equals(endHour, creneau.endHour) &&
                Objects.equals(sdf, creneau.sdf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, startHour, endHour, sdf);
    }
}
