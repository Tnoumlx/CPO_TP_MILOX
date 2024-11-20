/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package tp1_convertisseur_milox;

import java.util.Scanner;

/**
 *
 * @author miloxantoine
 */
public class TP1_convertisseur_MILOX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc = new Scanner(System.in);
         //Demande à l'utilisateur
        System.out.print("Bonjour, saisissez une valeur de température : ");
        double temperature = sc.nextDouble();

        //Menu
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");
        System.out.print("Votre choix : ");
        int choix = sc.nextInt();

        double resultat;
        // Réalise la conversion en fonction du choix 
        switch (choix) { 
            case 1:
                resultat = CelsiusVersKelvin(temperature);
                System.out.println(temperature + " degrés Celsius est égal à " + resultat + " degrés Kelvin.");
                break;
            case 2:
                resultat = KelvinVersCelsius(temperature);
                System.out.println(temperature + " degrés Kelvin est égal à " + resultat + " degrés Celsius.");
                break;
            case 3:
                resultat = FahrenheitVersCelsius(temperature);
                System.out.println(temperature + " degrés Fahrenheit est égal à " + resultat + " degrés Celsius.");
                break;
            case 4:
                resultat = CelsiusVersFahrenheit(temperature);
                System.out.println(temperature + " degrés Celsius est égal à " + resultat + " degrés Fahrenheit.");
                break;
            case 5:
                resultat = KelvinVersFahrenheit(temperature);
                System.out.println(temperature + " degrés Kelvin est égal à " + resultat + " degrés Fahrenheit.");
                break;
            case 6:
                resultat = FahrenheitVersKelvin(temperature);
                System.out.println(temperature + " degrés Fahrenheit est égal à " + resultat + " degrés Kelvin.");
                break;
            default:
                System.out.println("Choix non valide.");
                break;
        }

        
    }

    //Conversion de Celsius à Kelvin
    public static double CelsiusVersKelvin(double tCelsius) {
        return tCelsius + 273.15;
    }

    //Conversion de Kelvin à Celsius
    public static double KelvinVersCelsius(double tKelvin) {
        return tKelvin - 273.15;
    }
    
    //Conversion de Fahrenheit à Celsius
    public static double FahrenheitVersCelsius(double tFahrenheit) {
        return (tFahrenheit  - 32) * 5 / 9;
    }
    
    //Conversion de Celsius à Fahrenheit
    public static double CelsiusVersFahrenheit(double tCelsius) {
        return (tCelsius * 9 / 5) + 32;
    }
    
    //Conversion de Kelvin à Fahrenheit
    public static double KelvinVersFahrenheit(double tKelvin) {
        return (tKelvin - 273.15) * 9 / 5 + 32;
    }
    
    //Conversion de Fahrenheit à Kelvin
    public static double FahrenheitVersKelvin(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9 + 273.15;
    }
}
