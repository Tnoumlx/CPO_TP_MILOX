/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_milox;

/**
 *
 * @author miloxantoine
 */
public class TP2_Bieres_MILOX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    /* EXERCICE 1 */
    
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;

    
    uneBiere.lireEtiquette();
    
    
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe") ;
    
    autreBiere.lireEtiquette();
    
    BouteilleBiere BiereTrois = new BouteilleBiere("Zibul", 6.5, "Domaine de Lorkil") ;
    
    BiereTrois.lireEtiquette();
    
    BouteilleBiere BiereQuatre = new BouteilleBiere("Jurzol", 6.4, "Brasserie des bandits") ;
    
    BiereQuatre.lireEtiquette();
    
    BouteilleBiere BiereCinq = new BouteilleBiere("Rekop", 6.3, "Chaudron de Ragnar") ;
    
    BiereCinq.lireEtiquette();
    
    BiereCinq.Decapsuler(); // Decapsule
    BiereCinq.Decapsuler(); // Verifie que la bouteille est deja ouverte
    
    
    autreBiere.Decapsuler();
    
    
    
    System.out.println(uneBiere) ; // Affichage des informations
    System.out.println(autreBiere) ;
    System.out.println(BiereCinq) ;
    System.out.println(BiereQuatre) ;

    }
    

    
    

    
}
