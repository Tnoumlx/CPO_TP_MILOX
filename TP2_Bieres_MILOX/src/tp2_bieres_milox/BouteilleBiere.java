/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_milox;

/**
 *
 * @author miloxleila
 */
public class BouteilleBiere {
    
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false; // Attributs de la biere
    }

    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool +
                " degrés) \nBrasserie : " + brasserie);
    }
    public boolean Decapsuler() {
        if (!ouverte) { // Vérifie si la bouteille est fermée
            ouverte = true;
            
            return true; // Retourne vrai si l'ouverture réussit
        } else {
            System.out.println("Erreur : Bière déjà ouverte.");
            return false; // Retourne faux si elle est déjà ouverte
        }
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
    }

}

    
    

