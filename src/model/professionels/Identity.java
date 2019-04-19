package model.professionels;

import java.util.Date;

class Identity
{
    private String nom;
    private Date dateDeNaissance;

    public Identity(String nom, Date dateDeNaissance)
    {
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public Date getDateDeNaissance()
    {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance)
    {
        this.dateDeNaissance = dateDeNaissance;
    }
}
