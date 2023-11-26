/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author toled
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String posicion;
        int edad;
        double estatura;
        String  opc; 

        do {
            System.out.print("Ingrese el nombre del jugador: ");
            nombre = entrada.nextLine();

            System.out.print("Ingrese la posición del jugador: ");
            posicion = entrada.nextLine();

            System.out.print("Ingrese la edad del jugador: ");
            edad = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer

            System.out.print("Ingrese la estatura del jugador: ");
            estatura = entrada.nextDouble();
            entrada.nextLine(); // Limpiar el buffer
            System.out.print("desea ingresar otro jugador _"
                    + "precione (s/n) ");
            estatura = entrada.nextDouble();
            while (opc = "s");

            

          

        
                
    
