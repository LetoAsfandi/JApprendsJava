/*
 * Classe décrivant une voiture
 * @version 1.03
 * @author Thierry Ernesto Baribaud.
 */
package com.anstel.japprendsjava;

/**
 * classe décrivant une voiture
 */
public class Voiture {

    /**
     * marque de la voiture
     */
    private String marque;

    /**
     * modèle de la voiture
     */
    private String modele;

    /**
     * Puissance de la voiture exprimée en chevaux
     */
    private int puissance;

    /**
     * Nombre de kilomètres effectués.
     * A la création la voiture n'a pas de kilométrage.
     */
    private float kilometrage=0;

    /**
     * Constructeur principal de la classe.
     * @param marque de la voiture
     */
    public Voiture(String marque) {
        this.marque = marque;
    }

    /**
     * Constructeur secondaire de la classe.
     * @param marque marque de la voiture.
     * @param modele modèle de la voiture.
     */
    public Voiture(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    /**
     * Retourne la marque de la voiture
     * @return la marque de la voiture
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Définit la marque de la voiture
     * @param marque la marque de la voiture
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * Retourne le modèle de la voiture
     * @return le modèle de la voiture
     */
    public String getModele() {
        return modele;
    }

    /**
     * Définit le modèle de la voiture
     * @param modele le modèle de la voiture
     */
    public void setModele(String modele) {
        this.modele = modele;
    }
    /**
     * Retourne la puissance de la voiture
     * @return la puissance de la voiture
     */
    public int getPuissance() {
        return puissance;
    }

    /**
     * Définit la puissance de la voiture
     * @param puissance la puissance de la voiture
     */
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
    /**
     * Retourne le kilométrage de la voiture
     * @return le kilométrage de la voiture
     */
    public float getKilometrage() {
        return kilometrage;
    }

    /**
     * Définit le kilométrage de la voiture
     * @param kilometrage le kilométrage de la voiture
     */
    public void setKilometrage(float kilometrage) {
        this.kilometrage = kilometrage;
    }

    /**
     * Retourne l'objet sous forme textuelle
     * @return l'objet sous forme textuelle
     */
    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", puissance= " + puissance +
                ", kilometrage= " + kilometrage  +
                '}';
    }
}
