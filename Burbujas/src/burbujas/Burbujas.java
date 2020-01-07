package burbujas;

import java.util.Random;
import java.util.Scanner;
public class Burbujas {

    public static void main(String[] args) {
        Burbujas programa = new Burbujas();

        int tubos[][] = new int[4][4];

        programa.rellenar_tubos(tubos);
        programa.enseñar_tubos(tubos);
        programa.escoger(tubos);
    }

    void rellenar_tubos(int[][] tubos) {
        //rellenar tubos con numeros random
        Random random = new Random();
        int valor_actual;
        int i = 0;
        while (i != tubos.length - 1) {
            int j = 0;
            while (j != tubos[0].length) {
                tubos[i][j] = random.nextInt(tubos.length - 1) + 1; //tal y como está, se generan números en los tubos de 1 a n-1 donde n es el número de tubos
                valor_actual = tubos[i][j];
                int cont = comprobación(tubos, valor_actual);
                if (cont <= 4) {
                    j++;
                }
            }
            i++;
        }
    }

    void enseñar_tubos(int[][] tubos) {
        //se nos enseña el estado de los tubos
//        int i = 0;
//        while (i != tubos.length) {
//            int j = 0;
//            while (j != tubos[0].length) {
//                System.out.print(tubos[i][j]);
//                j++;
//            }
//            System.out.println("");
//            i++;
//        }

//con esto se mostraran los tubos en vertical
        for (int i = 0; i < tubos[0].length; i++) {
            for (int j = 0; j < tubos.length; j++) {
                System.out.print(tubos[j][i] + " ");
            }
            System.out.println();
        }

    }

    int comprobación(int[][] tubos, int valor_actual) {
        //este método impedirá que se generen más de cuatro números iguales en todo el programa.
        int cont = 0;
        int i = 0;
        while (i != tubos.length) {
            int j = 0;
            while (j != tubos[0].length) {
                if (valor_actual == tubos[i][j]) {
                    cont++;
                }
                j++;
            }
            i++;
        }

        return cont;
    }
    
    void escoger(int[][] tubos){
    Scanner teclat = new Scanner (System.in);
        char elección = 'R';
        System.out.println("Mover: M");
        System.out.println("Atrás: A");
        System.out.println("Reset: R");
        System.out.println("Fin: F");
        System.out.println("elige una de las opciones:");
         elección = teclat.next().charAt(0);
         while (elección != 'F'){
             System.out.println("elige una de las opciones:");
         elección = teclat.next().charAt(0);
             switch (elección){
                 case 'M': 
                     break;
                 case 'A':
                     break;
                 case 'R':
                     break;
                 default: System.out.println("Valor incorrecto; vuelve a introducir el valor:");
         
         }
         
         }
    
    }
}
