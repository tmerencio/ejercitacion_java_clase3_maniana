package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] argsv) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese m: ");
        int m = scanner.nextInt();

        scanner.close();

        int i = 0;
        int j = 1;
        while(i < n){
            if (m%j==0){
                System.out.println(j);
                i++;
            }
            j++;
        }
    }
}
