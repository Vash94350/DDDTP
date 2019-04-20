package model.professionels;

import Commun.dto.DTO_Entretien2;
import Exeption.StartHourAfterEndHourException;

public class Recruteur extends Profil
{
    public Recruteur(Adresse adresse, Identity identity)
    {
        super(adresse, identity, Grade.FORT);
    }

    public void planifieEntretien(DTO_Entretien2 dto_entretien)
    {
        try
        {
            Creneau creneau = new Creneau(dto_entretien.getDateEntretien(),dto_entretien.getDuration());
            Recruteur recruteur = new Recruteur(new Adresse(dto_entretien.getNomDeRueRecruteur(),dto_entretien.getNumeroRueRecruteur(),dto_entretien.getVilleRecruteur(),dto_entretien.getPaysRecruteur(),dto_entretien.getCodePostaleRecruteur()),new Identity(dto_entretien.getNomRecruteur(),dto_entretien.getDateDeNaissanceRecruteur()));
            Candidat candidat = new Candidat(new Adresse(dto_entretien.getNomDeRueCandidat(),dto_entretien.getNumeroRueCandidat(),dto_entretien.getVilleCandidat(),dto_entretien.getPaysCandidat(),dto_entretien.getCodePostaleCandidat()),new Identity(dto_entretien.getNomCandidat(),dto_entretien.getDateDeNaissanceCandidat()));
            Entretien nouvelEntretien = new Entretien(dto_entretien.getStatut(),creneau,recruteur,candidat);
        }
        catch (StartHourAfterEndHourException e)
        {
            e.printStackTrace();
        }
    }
}
