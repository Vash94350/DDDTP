package model.professionels;

import Exeption.ARecruteurRHCannotUpgradeHimSelf;

public class RecruteurRHSuivi extends RecruteurRH
{
    public RecruteurRHSuivi(Adresse adresse, Identity identity)
    {
        super(adresse, identity);
    }

    public void changerGradeSalarie(Profil profil,Grade grade) throws ARecruteurRHCannotUpgradeHimSelf {
        if(profil==this)
        {
            throw new ARecruteurRHCannotUpgradeHimSelf("le recruteur n'a pas le droit de changer son propregrade");
        }
        else
        {
            profil.updateGrade(grade);
        }
    }
}
