package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static boolean cumpleCondicion(int numero, int m, int d){
        String number = String.valueOf(numero);

        char digitoBuscado = (char)(d+'0');

        int cantidadDigitos = 0;

        for(int i = 0; i < number.length(); i++) {
            if(number.charAt(i) == digitoBuscado)
                cantidadDigitos++;
        }

        return cantidadDigitos >= m;
    }

    public static void main(String[] argsv) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese m: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese d: ");
        int d = scanner.nextInt();

        scanner.close();

        int i = 0;
        int j = 1;

        while(i < n){
            if (cumpleCondicion(j, m, d)){
                System.out.println(j);
                i++;
            }
            j++;
        }
    }
}
