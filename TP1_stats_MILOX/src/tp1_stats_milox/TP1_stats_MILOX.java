/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_milox;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author miloxleila
 */
public class TP1_stats_MILOX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        int[] Tableau = new int[6];
        for (int i=0; i < Tableau.length; i++) {
            Tableau[i] = 0;
        
        }
        
        System.out.println("Saisissez un nombre entier m");
        int m = sc.nextInt();
        for (int i = 0; i< m; i++){
            int res = generateurAleat.nextInt(6);
            Tableau[res]++;
         
        }
        System.out.println("\nRésultats pour vérifier la répoartition de la génération aléatoire");
        for (int i = 0; i< Tableau.length; i++){
            System.out.println("Nombre" +(i+1) + " : " + Tableau[i] + "occurence");
            
         
        }
        System.out.println("\nRésultats pour vérifier la répoartition de la génération aléatoire en pourcentage");
        for (int i = 0; i< Tableau.length; i++){
            double pourcentage = ((double) Tableau[i]/m) * 100;
            System.out.println("Nombre" +(i+1) + " : " + String.format("%.2f",pourcentage) + "%");
            
        }
        
        
        
        
        
        
        
    }    
    
    
}
