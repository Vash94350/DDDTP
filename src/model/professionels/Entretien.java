package model.professionels;

import Commun.dto.DTO_Candidat;
import Commun.dto.DTO_Recruteur;

public class Entretien
{
    private StatutsEntretien statut;
    private Creneau creneau;
    private Recruteur recruteur;
    private Candidat candidat;
    private EntretienId entretienId;

    public Entretien(StatutsEntretien statut, Creneau creneau, DTO_Recruteur recruteur, DTO_Candidat candidat)
    {
        this.statut = statut;
        this.recruteur.set=recruteur.getNom();
        this.creneau = creneau;
        this.recruteur = recruteur;
        this.candidat.getIdentity().setNom(recruteur.getNom());
        this.entretienId=new EntretienId(creneau.getDateToString()+candidat.getIdentity().getNom());
    }
}
