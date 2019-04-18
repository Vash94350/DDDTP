public class RecruteurRH extends Recruteur
{

    public RecruteurRH(Adresse adresse, Identity identity)
    {
        super(adresse, identity);
    }

    public void planifieReunion()
    {
        Entretien nouvelEntretien = new Entretien();
    }
}
