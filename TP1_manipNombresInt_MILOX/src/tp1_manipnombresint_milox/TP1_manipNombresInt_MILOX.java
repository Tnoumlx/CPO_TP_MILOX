/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_milox;

import java.util.Scanner;

/**
 *
 * @author miloxantoine
 */
public class TP1_manipNombresInt_MILOX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        //Demande à l'utilisateur les deux nb
        System.out.println("Entrez le premier entier : ");
        int nb1 = sc.nextInt();

        System.out.println("Entrez le deuxième entier : ");
        int nb2 = sc.nextInt();

        
        System.out.println("Vous avez saisi les nombres : " + nb1 + " et " + nb2);

        //Calcul somme,différence et produit
        int somme = nb1 + nb2;
        int difference = nb1 - nb2;
        int produit = nb1 * nb2;

        System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La différence des deux nombres est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);

        //Calcul et affichage du quotient et du reste
        int quotient = nb1 / nb2;
        int reste = nb1 % nb2;

        System.out.println("Le quotient entier de la division du premier par le second est : " + quotient);
        System.out.println("Le reste de la division euclidienne du premier par le second est : " + reste);

        
        }

    }
    


