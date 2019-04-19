package Commun.dto;

import model.professionels.*;

import java.util.Date;

public class DTO_Entretien
{
    private Entretien entretien;
    private DTO_Recruteur recruteur;
    private DTO_Candidat candidat;

    public DTO_Entretien(StatutsEntretien statut, double duration, Date date, DTO_Recruteur recruteur, DTO_Candidat candidat)
    {
        this.statut = statut;
        this.creneau = creneau;
        this.recruteur = recruteur;
        this.candidat = candidat;
    }

    public StatutsEntretien getStatut()
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
