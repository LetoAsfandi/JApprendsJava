/*
 * Classe décrivant une bicyclette
 * @version 1.06
 * @author Thierry Ernesto Baribaud.
 */
package com.anstel.japprendsjava;

/**
 * classe décrivant une bicyclette
 */
public class Bicyclette extends Vehicule {

    // Les attributs ci-dessous

    // Les constructeurs de la classe ci-dessous

    /**
     * Constructeur principal de la classe.
     *
     * @param marque de la bicyclette
     */
    public Bicyclette(String marque) {
//        super(marque);
        this(marque,null);
    }

    /**
     * Constructeur secondaire de la classe.
     *
     * @param marque marque de la bicyclette.
     * @param modele modèle de la bicyclette.
     */
    public Bicyclette(String marque, String modele) {
        super(marque, modele);
        setRoue(2);
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
        return "Bicyclette{" +
                super.toString()+
                '}';
    }
}
