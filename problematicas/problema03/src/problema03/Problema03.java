/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author toled
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 2;
        int limite = 3;
        String cadena = " ";
        //System.out.println(i);
        System.out.println(i);
        do {
            i = i + limite;
            limite = limite + 2;

            cadena = String.format("%s", i);
            System.out.println(cadena);

        } while (i < 37);

    }

}

/*2   +3 
5   + 5
10  +7
17   +9         do -while
26   +11
37
 */
