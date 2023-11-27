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
       //String reporte = ""
        String apellido;
        String nombresCompl = " ";
        String cadena = " ";
        String nombre;
        String posicion;
        int edad;
        double estatura;
        boolean bandera = true;
        int salida;
        int cant = 1;
        double promedioEdad;
        double promedioEstaturas;
        int sumaEdades = 0;
        int sumaEstaturas = 0;

        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombre = entrada.nextLine();

            System.out.println("Ingrese el apellido del Jugador: ");
            apellido = entrada.nextLine();

            System.out.println("Ingrese la posición en el campo: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador");
            estatura = entrada.nextDouble();
            nombresCompl = String.format("%s %s", nombre, 
                    apellido).toUpperCase();

            cant = cant + 1;
            cadena = String.format("%s. %s -%s-,edad %s, estatura  %s\n"
                    , cant, nombresCompl, posicion, edad,
                    estatura);
            
            cadena = cadena + cadena;

            System.out.println("Ingrese (1) si desea salir del ciclo; "
                    + "cualquier otro número para continuar");
            salida = entrada.nextInt();

            sumaEdades = sumaEdades + edad;

            promedioEdad = (double) sumaEdades / cant;
            promedioEstaturas = (double) sumaEstaturas / cant;

            if (salida == 1) {
                bandera = false;
            }

            entrada.nextLine();
        } while (bandera);
        
        
        
        
        
        
        
        
        //reporte = String.format("%s\ns%", promedioEdad, promedioEstaturas);
        
        System.out.printf("----Listado de jugadores ----\n%s\n", cadena);
        System.out.printf("Promedio de edades:%s\nPomedio de estaturas:%s"
                ,promedioEdad, promedioEstaturas);

    }
}
