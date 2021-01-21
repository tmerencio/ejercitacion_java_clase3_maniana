package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] argsv) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero: ");
        int numero = scanner.nextInt();

        scanner.close();

        int contador = 2;
        boolean primo=true;

        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }

        if(primo)
            System.out.print("Es primo");
        else
            System.out.print("No es primo");

    }
}
