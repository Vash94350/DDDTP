package model.professionels;

import Exeption.StartHourAfterEndHourException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

class Creneau
{
    private Date date;
    private String startHour;
    private String endHour;
    private String dateID;
    private double duration;

    private SimpleDateFormat sdfHMS = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat sdfID=new SimpleDateFormat("dd-MM-yyyy HH");

    public Creneau(Date date, double duration) throws StartHourAfterEndHourException
    {
        if(duration < 0)
            throw new StartHourAfterEndHourException("La durée du créneau ne peut pas être négative.");
        this.date = date;
        this.startHour = sdfHMS.format(date);
        this.endHour = sdfHMS.format(date.getTime() + duration*3600000);
        this.duration = duration;
        this.dateID=sdfID.format(date);

    }

    public void printCreneau() {
        System.out.println("Date : " + date.toString() + ", heureDébut : " + startHour + ", heureFin : " + endHour);
    }

    public String getDateToString()
    {
        return this.dateID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creneau creneau = (Creneau) o;
        return Objects.equals(date, creneau.date) &&
                Objects.equals(startHour, creneau.startHour) &&
                Objects.equals(endHour, creneau.endHour) &&
                Objects.equals(sdfHMS, creneau.sdfHMS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, startHour, endHour, sdfHMS);
    }
}
