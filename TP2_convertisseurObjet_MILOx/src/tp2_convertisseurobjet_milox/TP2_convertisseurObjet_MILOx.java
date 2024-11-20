/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_milox;
import java.util.Scanner;
/**
 *
 * @author miloxleila
 */
public class TP2_convertisseurObjet_MILOx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Convertisseur convertisseur1 = new Convertisseur();
        Convertisseur convertisseur2 = new Convertisseur();
        // Saisie de la température par l'utilisateur
        System.out.print("Bonjour, saisissez une valeur de température : ");
        double temperature = sc.nextDouble();
        
        
        
        
        int choix1;

        // Menu de conversion convertisseur1
        do{
        
            System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
            System.out.println("1) De Celsius vers Kelvin");
            System.out.println("2) De Kelvin vers Celsius");
            System.out.println("3) De Fahrenheit vers Celsius");
            System.out.println("4) De Celsius vers Fahrenheit");
            System.out.println("5) De Kelvin vers Fahrenheit");
            System.out.println("6) De Fahrenheit vers Kelvin");
            System.out.println("7) Quitter");
            System.out.println("Votre choix : ");
            choix1 = sc.nextInt(); // Lecture de l'entrée utilisateur
    double resultat; // Variable pour stocker le résultat de la conversion

    switch (choix1) {
        case 1 -> {
            resultat = convertisseur1.CelsiusVersKelvin(temperature);
            System.out.println(temperature + " degrés Celsius est égal à " + resultat + " degrés Kelvin.");
        }
        case 2 -> {
            resultat = convertisseur1.KelvinVersCelsius(temperature);
            System.out.println(temperature + " degrés Kelvin est égal à " + resultat + " degrés Celsius.");
        }
        case 3 -> {
            resultat = convertisseur1.FahrenheitVersCelsius(temperature);
            System.out.println(temperature + " degrés Fahrenheit est égal à " + resultat + " degrés Celsius.");
        }
        case 4 -> {
            resultat = convertisseur1.CelsiusVersFahrenheit(temperature);
            System.out.println(temperature + " degrés Celsius est égal à " + resultat + " degrés Fahrenheit.");
        }
        case 5 -> {
            resultat = convertisseur1.KelvinVersFahrenheit(temperature);
            System.out.println(temperature + " degrés Kelvin est égal à " + resultat + " degrés Fahrenheit.");
        }
        case 6 -> {
            resultat = convertisseur1.FahrenheitVersKelvin(temperature);
            System.out.println(temperature + " degrés Fahrenheit est égal à " + resultat + " degrés Kelvin.");
        }
        case 7 -> System.out.println("Vous avez choisi de quitter le programme.");
        default -> System.out.println("Choix non valide. Veuillez réessayer.");
        }
        } while (choix1 != 7); // Continue tant que l'utilisateur ne choisit pas de quitter.
        
        int choix2;
        // Menu de conversion convertisseur2
        do {
    System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
    System.out.println("1) De Celsius vers Kelvin");
    System.out.println("2) De Kelvin vers Celsius");
    System.out.println("3) De Fahrenheit vers Celsius");
    System.out.println("4) De Celsius vers Fahrenheit");
    System.out.println("5) De Kelvin vers Fahrenheit");
    System.out.println("6) De Fahrenheit vers Kelvin");
    System.out.println("7) Quitter");
    System.out.println("Votre choix : ");
    
    choix2 = sc.nextInt(); // Lecture de l'entrée utilisateur
    double resultat; // Variable pour stocker le résultat de la conversion

    switch (choix2) {
        case 1 -> {
            resultat = convertisseur2.CelsiusVersKelvin(temperature);
            System.out.println(temperature + " degrés Celsius est égal à " + resultat + " degrés Kelvin.");
        }
        case 2 -> {
            resultat = convertisseur2.KelvinVersCelsius(temperature);
            System.out.println(temperature + " degrés Kelvin est égal à " + resultat + " degrés Celsius.");
        }
        case 3 -> {
            resultat = convertisseur2.FahrenheitVersCelsius(temperature);
            System.out.println(temperature + " degrés Fahrenheit est égal à " + resultat + " degrés Celsius.");
        }
        case 4 -> {
            resultat = convertisseur2.CelsiusVersFahrenheit(temperature);
            System.out.println(temperature + " degrés Celsius est égal à " + resultat + " degrés Fahrenheit.");
        }
        case 5 -> {
            resultat = convertisseur2.KelvinVersFahrenheit(temperature);
            System.out.println(temperature + " degrés Kelvin est égal à " + resultat + " degrés Fahrenheit.");
        }
        case 6 -> {
            resultat = convertisseur2.FahrenheitVersKelvin(temperature);
            System.out.println(temperature + " degrés Fahrenheit est égal à " + resultat + " degrés Kelvin.");
        }
        case 7 -> System.out.println("Vous avez choisi de quitter le programme.");
        default -> System.out.println("Choix non valide. Veuillez réessayer.");
    }
} while (choix2 != 7); // Continue tant que l'utilisateur ne choisit pas de quitter.

        
System.out.println("\n Résultats finaux");
System.out.println("Convertisseur 1 :" + convertisseur1.toString()); 
System.out.println("Convertisseur 2 :" + convertisseur2.toString());         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
