package model.professionels;

import Commun.dto.DTO_Entretien;

public class Recruteur extends Profil
{
    public Recruteur(Adresse adresse, Identity identity)
    {
        super(adresse, identity, Grade.FORT);
    }

    public void planifieEntretien(DTO_Entretien dto_entretien)
    {
        Entretien nouvelEntretien = new Entretien(dto_entretien.getStatut(),dto_entretien.getCreneau(),dto_entretien.getRecruteur(),dto_entretien.getCandidat());
    }
}
