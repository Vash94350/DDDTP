package model.professionels;

public class Adresse
{
    private String nomDeRue;
    private String numero;
    private String ville;
    private String pays;
    private String codePostale;

    public Adresse(String nomDeRue, String numero, String ville, String pays, String codePostale) {
        this.nomDeRue = nomDeRue;
        this.numero = numero;
        this.ville = ville;
        this.pays = pays;
        this.codePostale = codePostale;
    }
}
