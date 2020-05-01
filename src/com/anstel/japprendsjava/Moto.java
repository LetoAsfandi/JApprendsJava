/*
 * Classe décrivant une moto
 * @version 1.05
 * @author Thierry Ernesto Baribaud.
 */
package com.anstel.japprendsjava;

/**
 * classe décrivant une moto
 */
public class Moto extends Vehicule {

    // Les attributs ci-dessous

    // Les constructeurs de la classe ci-dessous

    /**
     * Constructeur principal de la classe.
     *
     * @param marque de la moto
     */
    public Moto(String marque) {
        super(marque);
    }

    /**
     * Constructeur secondaire de la classe.
     *
     * @param marque marque de la moto.
     * @param modele modèle de la moto.
     */
    public Moto(String marque, String modele) {
        super(marque, modele);
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
        return "Moto{" +
                super.toString()+
                '}';
    }
}
