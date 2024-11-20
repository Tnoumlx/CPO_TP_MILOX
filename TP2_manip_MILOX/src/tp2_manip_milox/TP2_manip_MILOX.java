/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_milox;

/**
 *
 * @author miloxleila
 */
public class TP2_manip_MILOX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        
        Tartiflette assiette3 = assiette2 ;
        
        // Deux tartiflettes sont créées et assiette 2 et assiette 3 referencent mnt le même objet
        
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        
        // L'affichage est 600 pour les deux, on a la verification
        
        assiette2.nbCalories += 100;
        
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        
        // On a bien 700 après incrémentation aussi

        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;
        
        System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        
        // L'affichage donne 600 pour 1 et 500 pour 2
        
        // Moussaka assiette666 = assiette1 ;
        // Moussaka assiette667 = new Tartiflette() ;
        // Ces lignes sont fausse, un objet de type moussaka ne peut etre assigné à un objet de type taritflette
        
        //Création d'un tableau avec 10 objets de type Moussaka
        Moussaka[] Tableau = new Moussaka[10];
        for (int i = 0; i< Tableau.length; i++){
            Tableau[i] = new Moussaka(100 + i);
            
        }
// Dernière question (rhétorique) : pourrait-on avoir un objet, et qu’une référence vers cet objet soit en
// attribut d’un autre objet?... et si oui, n’est-ce pas finalement une façon de modéliser une relation
// aux objets ? Oui c'est tout à fait possible 
        
        
        
        
        
        
        
        
        
        
        
        
        } 
}
