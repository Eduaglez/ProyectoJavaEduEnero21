/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaentornos4_4_2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PracticaEntornos4_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conversionGrados();
    }
    public static void conversionGrados() {
    /*Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
    Recordar que la fórmula para la conversión es:
    C = (F-32)*5/9*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("dime las cifras en grados Farenheit que deseas calcular");
        float farenheit = entrada.nextFloat();
        float celsius = 0;
        celsius = (farenheit - 32) * 5 / 9;
        System.out.print("El resultado en grados Celsius es "+celsius);
    }
}
