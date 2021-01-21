package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static boolean esPrimo(int n) {
        int contador = 2;
        boolean primo=true;

        while ((primo) && (contador!=n)){
            if (n % contador == 0)
                primo = false;
            contador++;
        }

        return primo;
    }

    public static void main(String[] argsv) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();

        scanner.close();

        int i = 0;
        int j = 1;

        while(i < n){
            if (esPrimo(j)){
                System.out.println(j);
                i++;
            }
            j++;
        }
    }
}
