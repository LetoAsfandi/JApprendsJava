/*
 * Classe décrivant une voiture
 * @version 1.02
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
     * Retourne l'objet sous forme textuelle
     * @return l'objet sous forme textuelle
     */
    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                "modele='" + modele + '\'' +
                '}';
    }
}
