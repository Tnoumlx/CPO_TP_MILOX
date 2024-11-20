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

    public Epee(double finesse, String nom, double NiveauAttaque) {
        super(nom, NiveauAttaque);
        this.finesse = finesse;
    }
    
    }

