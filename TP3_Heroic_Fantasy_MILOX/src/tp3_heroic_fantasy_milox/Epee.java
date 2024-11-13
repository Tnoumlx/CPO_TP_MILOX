/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_milox;

/**
 *
 * @author miloxantoine
 */
public abstract class Epee extends Arme {
    private double finesse;
    
    public Epee(String nom, double niveauAttaque, double finesse){
        this.nom = nom;
        if (NiveauAttaque <= 100 && NiveauAttaque >= 0) {
            this.NiveauAttaque = NiveauAttaque;
        } else {
            System.out.println("Niveau d'attaque Compris entre 0 et 100");
        }
    }
}
