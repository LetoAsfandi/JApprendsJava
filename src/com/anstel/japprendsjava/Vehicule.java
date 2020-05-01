/*
 * Classe décrivant un vehicule
 * @version 1.06
 * @author Thierry Ernesto Baribaud.
 */
package com.anstel.japprendsjava;

/**
 * classe décrivant un véhicule
 */
public abstract class Vehicule {

    // Les attributs ci-dessous

    /**
     * marque du véhicule
     */
    private String marque;

    /**
     * modèle du véhicule
     */
    private String modele;

    /**
     * Nombre de kilomètres effectués.
     * A la création le véhicule n'a pas de kilométrage.
     */
    private float kilometrage = 0;

    /**
     * Nombre de roue
     */
    private int roue;

    // Les constructeurs de la classe ci-dessous

    /**
     * Constructeur principal de la classe.
     *
     * @param marque du véhicule
     */
    public Vehicule(String marque) {
        this.marque = marque;
    }

    /**
     * Constructeur secondaire de la classe.
     *
     * @param marque marque du vehicule.
     * @param modele modèle du vehicule.
     */
    public Vehicule(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    // Les Getters et les Setters ci-dessous

    /**
     * Retourne la marque du véhicule
     *
     * @return la marque du véhicule
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Définit la marque du véhicule
     *
     * @param marque la marque du véhicule
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * Retourne le modèle du véhicule
     *
     * @return le modèle du véhicule
     */
    public String getModele() {
        return modele;
    }

    /**
     * Définit le modèle du véhicule
     *
     * @param modele le modèle du véhicule
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     * Retourne le kilométrage du véhicule
     *
     * @return le kilométrage du véhicule
     */
    public float getKilometrage() {
        return kilometrage;
    }

    /**
     * Définit le kilométrage du véhicule
     *
     * @param kilometrage le kilométrage du véhicule
     */
    public void setKilometrage(float kilometrage) {
        this.kilometrage = kilometrage;
    }

    /**
     * Retourne le nombre de roue du véhicule
     *
     * @return le nombre de roue du véhicule
     */
    public int getRoue() {
        return roue;
    }

    /**
     * Définit le nombre de roue du véhicule
     *
     * @param roue le nombre de roue du véhicule
     */
    public void setRoue(int roue) {
        this.roue = roue;
    }
    // Les methodes de la classe ci-dessous

    // Accélère(), Freine(), Démarre(), Arrete(), ...

    // To string ci-dessous

    /**
     * Retourne l'objet sous forme textuelle
     *
     * @return l'objet sous forme textuelle
     */
    @Override
    public String toString() {
        return "Vehicule{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", kilometrage= " + kilometrage +
                ", roue= " + roue +
                '}';
    }
}
