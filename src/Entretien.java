public class Entretien
{
    private StatutsEntretien statut;
    private Creneau creneau;
    private Recruteur recruteur;
    private Candidat candidat;
    private EntretienId entretienId;

    public Entretien(StatutsEntretien statut, Creneau creneau, Recruteur recruteur, Candidat candidat)
    {
        this.statut = statut;
        this.creneau = creneau;
        this.recruteur = recruteur;
        this.candidat = candidat;
        this.entretienId=new EntretienId(creneau.getDateToString()+candidat.getIdentity().getNom());
    }
}
