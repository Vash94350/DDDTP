public class Profil
{
    private Adresse adresse;
    private Identity identity;
    private Grade grade;

    public Profil(Adresse adresse, Identity identity, Grade grade)
    {
        this.adresse = adresse;
        this.identity = identity;
        this.grade = grade;
    }

    public void updateGrade(Grade grade)
    {
        this.grade=grade;
    }
}
