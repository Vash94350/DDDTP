import Exeption.StartHourAfterEndHourException;
import Exeption.ARecruteurRHCannotUpgradeHimSelf;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.fail;

public class CreneauTests {

    @Test(expected = StartHourAfterEndHourException.class)
    public final void shouldThrowStartHourAfterEndHourException() throws StartHourAfterEndHourException
    {
        try
        {
            Date date = new Date();
            Creneau creneauM = new Creneau(date, -1);
        }
        catch (StartHourAfterEndHourException ex)
        {
            throw new StartHourAfterEndHourException("gééééééééééééééééééé");
        }
    }

    @Test(expected = ARecruteurRHCannotUpgradeHimSelf.class)
    public final void recruteurRHSuiviCannotUpgradeHimself() throws ARecruteurRHCannotUpgradeHimSelf
    {
        RecruteurRHSuivi recruteurRHSuivi=new RecruteurRHSuivi(new Adresse(),new Identity());
        try
        {
            recruteurRHSuivi.changerGradeSalarie(recruteurRHSuivi,Grade.VRAIMENT_BALAIZE);
        }
        catch (ARecruteurRHCannotUpgradeHimSelf aRecruteurRHCannotUpgradeHimSelf)
        {
            fail("AAARH nein");
        }
    }
}
