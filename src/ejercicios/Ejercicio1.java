package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] argsv) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();

        scanner.close();

        int i = 0;
        while(i < n) {
            if(i%2==0)
                System.out.println(i);
            i++;
        }
    }
}
