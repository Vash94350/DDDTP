package model.professionels;

class Candidat extends Profil
{
    public Candidat(Adresse adresse, Identity identity)
    {
        super(adresse, identity, Grade.NULL);
    }
}
