/*2
6
12
20
30
42
56
72
90
110
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author toled
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int limite = 2;
        String cadena = " ";

        while (i < 110) {
             i = i + limite;
            limite = limite + 2;
           

            cadena = String.format("%s", i);
            System.out.println(cadena);
        }

    }
}

/*2   +4
6  + 6
12  + 8
20  + 10
30  +12
42  +14            USANDO  WHILE
56  +16
72  +18
90  +20
110
 */
