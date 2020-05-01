/*
 * Classe décrivant une trottinette
 * @version 1.06
 * @author Thierry Ernesto Baribaud.
 */
package com.anstel.japprendsjava;

/**
 * classe décrivant une trottinette
 */
public class Trottinette extends Vehicule {

    // Les attributs ci-dessous

    // Les constructeurs de la classe ci-dessous

    /**
     * Constructeur principal de la classe.
     *
     * @param marque de la trottinette
     */
    public Trottinette(String marque) {
//        super(marque);
        this(marque,null);
    }

    /**
     * Constructeur secondaire de la classe.
     *
     * @param marque marque de la trottinette.
     * @param modele modèle de la trottinette.
     */
    public Trottinette(String marque, String modele) {
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
        return "Trottinette{" +
                super.toString()+
                '}';
    }
}
