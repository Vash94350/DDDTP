import Exeption.StartHourAfterEndHourException;

import java.util.Date;

public class Main
{
    public static void main(String[] args) {

        System.out.println("Hello World!");
        Date date = new Date();
        try
        {
            Creneau creneauM = new Creneau(date, 1);
            creneauM.printCreneau();
            Creneau creneauG = new Creneau(date, 3);
            creneauG.printCreneau();
            System.out.println(creneauG.equals(creneauM));
        }
        catch (StartHourAfterEndHourException ex)
        {
            ex.printStackTrace();
        }





    }
}
