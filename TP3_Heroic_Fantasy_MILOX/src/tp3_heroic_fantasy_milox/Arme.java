/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_milox;

/**
 *
 * @author miloxantoine
 */
public abstract class Arme {

    private final String nom;
    private double NiveauAttaque;

    public Arme(String nom, double NiveauAttaque) {
        this.nom = nom;
        if (NiveauAttaque <= 100 && NiveauAttaque >= 0) {
            this.NiveauAttaque = NiveauAttaque;
        } else {
            System.out.println("Niveau d'attaque Compris entre 0 et 100");
        }

    }

    public String renvoiNom() {
        return nom;

    }

    public double renvoiNiveauAttaque() {
        return NiveauAttaque;
    }

    @Override
    public String toString() {
        return "Arme : " + nom + "Niveau d'attaque " + NiveauAttaque;
    }
}
