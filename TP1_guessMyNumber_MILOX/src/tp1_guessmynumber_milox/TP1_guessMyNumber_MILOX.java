/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_milox;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author miloxantoine
 */
public class TP1_guessMyNumber_MILOX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in); 
        Random generateurAleat = new Random(); // nb aleatoire entre 0 et 100

        int ntest = generateurAleat.nextInt(100); // test 
        System.out.println(ntest);
        // Menu
        System.out.println("Choix de la difficulté");
        System.out.println("Facile ?");
        System.out.println("Moyen ?");
        System.out.println("Difficile ?");
        int choix = sc.nextInt();
        
        int max = 100;
        int nbTentatives = 0;
        //Diminution du nb de tentatives max et augmentation de l'intervalle avec la difficulté
        switch (choix){
            case 1:
                max = 20;
                nbTentatives = 20;
                break;
            case 2:
                max = 100;
                nbTentatives = 10;
                break;
            case 3:
                max = 500;
                nbTentatives = 10;
                break;
                      
                
        }
        
        int nombre = generateurAleat.nextInt(max );
        int tentatives = 0; // initialisation
        boolean trouve = false;
        
        System.out.println("Devinez le nombre entre 0 et "+ max);
        
        while (trouve == false && tentatives < nbTentatives ) { // tant que le nombre n'est pas trouvé et que le nb de tentatives max n'est pas dépassé
            System.out.println("Votre proposition ?");
            int proposition = sc.nextInt();
            tentatives++; // incrémentation nb de tentatives
            
            if (proposition < nombre){
                if (nombre - proposition > max/3){
                    System.out.println("Vraiment trop petit");
                 
                } else {
                    System.out.println("trop petit");
                }
            } else if (proposition > nombre){
                if (proposition - nombre > max/3){
                    System.out.println("Vraiment trop grand");
                    
                } else{
                    System.out.println("trop grand");
                }
                
            } else{
                trouve = true;
                System.out.println("Gagné, vous avez trouvé en " + tentatives + " tentatives");
                
            }
        }
    }

}
