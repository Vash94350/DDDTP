package model.professionels;

import Exeption.StartHourAfterEndHourException;
import Exeption.ARecruteurRHCannotUpgradeHimSelf;
import org.junit.Assert;
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

    /*
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
    } */

    @Test
    public final void creneau_One_Should_Be_Equal_To_Second() {
        Date now = new Date();
        try
        {
            Creneau creneauO = new Creneau(now, 1);
            Creneau creneauS = new Creneau(now, 1);

            Assert.assertTrue(creneauO.equals(creneauS));
        }
        catch (StartHourAfterEndHourException ex) {
            fail("AAARH nein");
        }
    }

    @Test
    public final void creneau_One_Should_Not_Be_Equal_To_Second() {
        Date now = new Date();
        try
        {
            Creneau creneauO = new Creneau(now, 1);
            Creneau creneauS = new Creneau(now, 2);

            Assert.assertFalse(creneauO.equals(creneauS));
        }
        catch (StartHourAfterEndHourException ex) {
            fail("AAARH nein");
        }
    }

    @Test
    public final void grade_From_MOYEN_Recruteur_Should_Not_Be_The_Same_After_Someone_Else_Updated_his_grade() {
        Adresse adresseRecruteur = new Adresse("rue Bidon", "12", "Paris", "France", "75012");
        //Recruteur recruteurMoyen = new Recruteur(adresseRecruteur, );
        //Recruteur unMecBaleze = new Recruteur(adresseRecruteur, );

        //unMecBaleze.updateGrade(recruteurMoyen, Grade.FORT);
    }
}
