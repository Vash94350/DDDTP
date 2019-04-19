public class DTO_Creer_Entretien
{
    private Entretien entretien;

    public DTO_Creer_Entretien(Candidat candidat,Recruteur recruteur,Creneau creneau)
    {
        entretien=new Entretien(StatutsEntretien.ACCEPTED,creneau,recruteur,candidat);
        //recruteur calendrier add entretienAtDate(
    }
}
