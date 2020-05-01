/*
 * Ce programme contient tout ce qui me sert à apprendre java
 * @version 1.01
 * @author Thierry Ernesto Baribaud.
 */
package com.anstel.japprendsjava;

/**
 * classe décrivant le programme JApprendsJava
 */
public class JApprendsJava {
    public static void main(String... args) {
        Voiture voiture;

        System.out.println("J'apprends Java!");

        // Création d'un nouvel objet Voiture
        voiture= new Voiture("Peugeot");

        // Retourne la marque de la voiture à l'aide du getter : getMarque()
        System.out.println("Voiture : "+voiture.getMarque());

        // Redéfini la marque de la voiture à l'aide du setter : setMarque()
        voiture.setMarque("Citroen");
        System.out.println("Voiture : "+voiture.getMarque());

        // Sollicite la méthode toString() de l'objet Voiture
        System.out.println(voiture);
    }
}