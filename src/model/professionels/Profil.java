package model.professionels;

class Profil
{
    private Adresse adresse;
    private Identity identity;
    private Grade grade;//todelete

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

    public Identity getIdentity()
    {
        return identity;
    }
}
