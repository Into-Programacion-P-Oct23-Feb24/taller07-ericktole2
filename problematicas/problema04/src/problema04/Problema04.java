/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author toled
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int i = 1;
        int limite = 15;
        int numerador = 1;
        int denominador = 1;
        String signo;
        String cadena = "";

        while (denominador <= limite) {

            if (denominador == i + 2) {
                signo = "+ ";
            } else {
                signo = "- ";
            }
            cadena = String.format("%s%s%d/%d ",
                    cadena,
                    signo,
                    numerador,
                    denominador);
            denominador = denominador + 1;
            
        }
        System.out.printf("%s %s",i,cadena);
    }
}

/*if (denominador == i + 2) {
                signo = "+ ";
            } else {
                signo = "- ";
                denominador = denominador + 2;
            }

            cadena = String.format("%s%s%d/%d ",
                    cadena,
                    signo,
                    numerador,
                    denominador);
            
            //numerador = numerador ;

            
        } // para manejar el signo asociado 

        System.out.printf("%s %s", i, cadena);

    }
}
 */
//1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15

