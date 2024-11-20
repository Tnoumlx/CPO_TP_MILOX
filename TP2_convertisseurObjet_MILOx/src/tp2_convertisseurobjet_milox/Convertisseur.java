/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_milox;

/**
 *
 * @author miloxleila
 */
public class Convertisseur {
    private int nbConversions;
    
    public Convertisseur(){
        nbConversions = 0;
    }
    
    // Conversion de Celsius à Kelvin
    public double CelsiusVersKelvin(double tCelsius) {
        nbConversions++;
        return tCelsius + 273.15;
        
    }

    // Conversion de Kelvin à Celsius
    public double KelvinVersCelsius(double tKelvin) {
        nbConversions++;
        return tKelvin - 273.15;
    }
    
    // Conversion de Fahrenheit à Celsius
    public double FahrenheitVersCelsius(double tFahrenheit) {
        nbConversions++;
        return (tFahrenheit  - 32) * 5 / 9;
    }
    
    // Conversion de Celsius à Fahrenheit
    public double CelsiusVersFahrenheit(double tCelsius) {
        nbConversions++;
        return (tCelsius * 9 / 5) + 32;
    }
    
    // Conversion de Kelvin à Fahrenheit
    public double KelvinVersFahrenheit(double tKelvin) {
        nbConversions++;
        return (tKelvin - 273.15) * 9 / 5 + 32;
    }
    
    // Conversion de Fahrenheit à Kelvin
    public double FahrenheitVersKelvin(double tFahrenheit) {
        nbConversions++;
        return (tFahrenheit - 32) * 5 / 9 + 273.15;
    }

    @Override
    public String toString() {
        return "Nombre de conversions effectuées : " + nbConversions;
    }
    
}
