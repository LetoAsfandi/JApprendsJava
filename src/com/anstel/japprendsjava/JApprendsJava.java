/*
 * Ce programme contient tout ce qui me sert à apprendre java
 * @version 1.06
 * @author Thierry Ernesto Baribaud.
 */
package com.anstel.japprendsjava;

/**
 * classe décrivant le programme JApprendsJava
 */
public class JApprendsJava {
    public static void main(String... args) {

        System.out.println("J'apprends Java!");

        tutoVoiture();
        tutoCamion();
        tutoBicyclette();
        tutoMoto();
        tutoTrottinette();
    }

    /**
     * Tutorial sur la voiture
     */
    private static void tutoVoiture(){
        Voiture voiture;

        // Création d'un nouvel objet Voiture
        voiture = new Voiture("Peugeot");

        // Retourne la marque de la voiture à l'aide du getter : getMarque()
        System.out.println("Voiture : " + voiture.getMarque());

        // Redéfini la marque de la voiture à l'aide du setter : setMarque()
        voiture.setMarque("Citroen");
        voiture.setModele("C4 Picasso");
//        voiture.setPuissance(150);
        System.out.println("Voiture : " + voiture.getMarque());

        // Sollicite la méthode toString() de l'objet Voiture
        System.out.println(voiture);

        // Création d'une voiture avec le constructeur secondaire
        voiture = new Voiture("Renaud", "Clio");
//        voiture.setPuissance(80);
        System.out.println(voiture);
    }

    /**
     * Tutorial sur le camion
     */
    private static void tutoCamion(){
        Camion camion;
        camion= new Camion("Mack","Superliner");
        System.out.println(camion);

        camion=new Camion("Berliez","X27");
        camion.setRoue(8);
        System.out.println(camion);
    }

    /**
     * Tutorial sur la bicyclette
     */
    private static void tutoBicyclette(){
        Bicyclette bicyclette;
        bicyclette= new Bicyclette("Go Sport","X512");
        System.out.println(bicyclette);
    }

    /**
     * Tutorial sur la moto
     */
    private static void tutoMoto(){
        Moto moto;
        moto= new Moto("Kawasaki","GTR");
        System.out.println(moto);
    }

    /**
     * Tutorial sur la trottinette
     */
    private static void tutoTrottinette(){
        Trottinette trottinette;
        trottinette= new Trottinette("Xiaomi","M365 Pro");
        System.out.println(trottinette);
    }
}