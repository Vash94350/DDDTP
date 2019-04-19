package Commun.dto;

import java.util.Date;

public class DTO_Recruteur
{
    private String nom;
    private Date dateDeNaissance;

    private String nomDeRue;
    private String numero;
    private String ville;
    private String pays;
    private String codePostale;

    public String getNom()
    {
        return nom;
    }

}
