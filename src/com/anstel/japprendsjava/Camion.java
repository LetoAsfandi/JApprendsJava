/*
 * Classe décrivant un camion
 * @version 1.06
 * @author Thierry Ernesto Baribaud.
 */
package com.anstel.japprendsjava;

public class Camion extends Vehicule{

    // Les attributs ci-dessous

    // Les constructeurs de la classe ci-dessous

    /**
     * Constructeur principal de la classe.
     *
     * @param marque du camion
     */
    public Camion(String marque) {
//      super(marque);
        this(marque,null);
    }

    /**
     * Constructeur secondaire de la classe.
     *
     * @param marque marque du camion.
     * @param modele modèle du camion.
     */
    public Camion(String marque, String modele) {
        super(marque, modele);
        setRoue(6);
    }

    /**
     * Retourne l'objet sous forme textuelle
     *
     * @return l'objet sous forme textuelle
     */
    @Override
    public String toString() {
        return "Camion{" +
                super.toString()+
                '}';
    }
}
