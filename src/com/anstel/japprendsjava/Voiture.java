/*
 * Classe décrivant une voiture
 * @version 1.01
 * @author Thierry Ernesto Baribaud.
 */
package com.anstel.japprendsjava;

public class Voiture {

    /**
     * marque de la voiture
     */
    private String marque;

    /**
     * Constructeur principal de la classe.
     * @param marque de la voiture
     */
    public Voiture(String marque) {
        this.marque = marque;
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
     * Retourne l'objet sous forme textuelle
     * @return l'objet sous forme textuelle
     */
    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                '}';
    }
}
