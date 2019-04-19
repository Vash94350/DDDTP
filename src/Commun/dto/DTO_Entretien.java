package Commun.dto;

import model.professionels.*;

public class DTO_Entretien
{
    private Entretien entretien;
    private StatutsEntretien_dto statut;
    private Creneau creneau;
    private Recruteur recruteur;
    private Candidat candidat;

    public DTO_Entretien(StatutsEntretien_dto statut, Creneau creneau, Recruteur recruteur, Candidat candidat)
    {
        this.statut = statut;
        this.creneau = creneau;
        this.recruteur = recruteur;
        this.candidat = candidat;
    }

    public StatutsEntretien_dto getStatut()
    {
        return statut;
    }

    public Creneau getCreneau()
    {
        return creneau;
    }

    public Recruteur getRecruteur()
    {
        return recruteur;
    }

    public Candidat getCandidat()
    {
        return candidat;
    }
}
