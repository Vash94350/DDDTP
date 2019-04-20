package Commun.dto;

import java.util.Date;

public class DTO_Entretien2
{
    private Date dateEntretien;
    private double duration;

    //Le statut de l'entretien sera a implementer quand l'enum sera dans /src

    private String nomDeRueCandidat;
    private String numeroRueCandidat;
    private String villeCandidat;
    private String paysCandidat;
    private String codePostaleCandidat;

    private String nomCandidat;
    private Date dateDeNaissanceCandidat;

    private String nomDeRueRecruteur;
    private String numeroRueRecruteur;
    private String villeRecruteur;
    private String paysRecruteur;
    private String codePostaleRecruteur;

    private String nomRecruteur;
    private Date dateDeNaissanceRecruteur;

    // meme que statut entretient pour le grade


    public Date getDateEntretien() {
        return dateEntretien;
    }

    public void setDateEntretien(Date dateEntretien) {
        this.dateEntretien = dateEntretien;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getNomDeRueCandidat() {
        return nomDeRueCandidat;
    }

    public void setNomDeRueCandidat(String nomDeRueCandidat) {
        this.nomDeRueCandidat = nomDeRueCandidat;
    }

    public String getNumeroRueCandidat() {
        return numeroRueCandidat;
    }

    public void setNumeroRueCandidat(String numeroRueCandidat) {
        this.numeroRueCandidat = numeroRueCandidat;
    }

    public String getVilleCandidat() {
        return villeCandidat;
    }

    public void setVilleCandidat(String villeCandidat) {
        this.villeCandidat = villeCandidat;
    }

    public String getPaysCandidat() {
        return paysCandidat;
    }

    public void setPaysCandidat(String paysCandidat) {
        this.paysCandidat = paysCandidat;
    }

    public String getCodePostaleCandidat() {
        return codePostaleCandidat;
    }

    public void setCodePostaleCandidat(String codePostaleCandidat) {
        this.codePostaleCandidat = codePostaleCandidat;
    }

    public String getNomCandidat() {
        return nomCandidat;
    }

    public void setNomCandidat(String nomCandidat) {
        this.nomCandidat = nomCandidat;
    }

    public Date getDateDeNaissanceCandidat() {
        return dateDeNaissanceCandidat;
    }

    public void setDateDeNaissanceCandidat(Date dateDeNaissanceCandidat) {
        this.dateDeNaissanceCandidat = dateDeNaissanceCandidat;
    }

    public String getNomDeRueRecruteur() {
        return nomDeRueRecruteur;
    }

    public void setNomDeRueRecruteur(String nomDeRueRecruteur) {
        this.nomDeRueRecruteur = nomDeRueRecruteur;
    }

    public String getNumeroRueRecruteur() {
        return numeroRueRecruteur;
    }

    public void setNumeroRueRecruteur(String numeroRueRecruteur) {
        this.numeroRueRecruteur = numeroRueRecruteur;
    }

    public String getVilleRecruteur() {
        return villeRecruteur;
    }

    public void setVilleRecruteur(String villeRecruteur) {
        this.villeRecruteur = villeRecruteur;
    }

    public String getPaysRecruteur() {
        return paysRecruteur;
    }

    public void setPaysRecruteur(String paysRecruteur) {
        this.paysRecruteur = paysRecruteur;
    }

    public String getCodePostaleRecruteur() {
        return codePostaleRecruteur;
    }

    public void setCodePostaleRecruteur(String codePostaleRecruteur) {
        this.codePostaleRecruteur = codePostaleRecruteur;
    }

    public String getNomRecruteur() {
        return nomRecruteur;
    }

    public void setNomRecruteur(String nomRecruteur) {
        this.nomRecruteur = nomRecruteur;
    }

    public Date getDateDeNaissanceRecruteur() {
        return dateDeNaissanceRecruteur;
    }

    public void setDateDeNaissanceRecruteur(Date dateDeNaissanceRecruteur) {
        this.dateDeNaissanceRecruteur = dateDeNaissanceRecruteur;
    }
}
