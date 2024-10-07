/*
 * TP0
 * Milox Antoine
 * 06 Octobre 2024

 */
package tp0_milox_antoine;

import java.util.Scanner;

/**
 *
 * @author miloxantoine
 */
public class TP0_Milox_Antoine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        * Exercice 1 : Affichage d'un message
        */ 
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prénom ?");
        prenom = sc.nextLine();
        
        
        
        System.out.println("Au revoir "+prenom);
        
        /*
        * Exercice 2 : Addition d'entiers
        */ 
        // Déclaration des variables
        int nb;
        int result;
        int ind;
        Scanner sc1 = new Scanner(System.in);
        result=0;
        System.out.println("Entrez le nombre :");
        nb=sc1.nextInt();
        
        // Addition des nb premiers entiers
        ind=1;
        while (ind <= nb) {
            result = result+ind;
            ind +=1;
        }
        
        // Affichage du résultat
        System.out.println();
        System.out.println("La somme des "+nb+" entiers est: "+result);
        
        /*
        * Exercice 3 : Calculette
        */ 
        int operateur;
        int operande1;
        int operande2;
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("Please enter the operator\n 1) add\n 2) substract\n 3) multiply\n 4) divide\n 5) modulo");
        operateur = sc2.nextInt();
        
        if (operateur > 5 || operateur < 1) {
            System.out.println("Mauvaise valeur pour l'opérateur");
            
            
        }
        
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Entrez la première valeur");
        operande1 = sc3.nextInt();
        System.out.println("Entrez la deuxième valeur");
        operande2 = sc4.nextInt();
        
        int resultat = 0;
        
        switch (operateur) {
            case 1: resultat = operande1 + operande2; break;
            case 2: resultat = operande1 - operande2; break;
            case 3: resultat = operande1 * operande2; break;
            case 4: resultat = operande1 / operande2; break;
            case 5: resultat = operande1 % operande2; break;
        
        } 
        System.out.println("Le résultat est : "+resultat);
      
        
        
        
        
        
        
        
    }
 

}
