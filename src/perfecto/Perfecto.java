package perfecto;

import java.util.Scanner;

/**
 *
 * @author yonyh
 */
public class Perfecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] v = new int[100];
        int n, i, j, x = 0, suma = 0;
        int total = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite el numero de elementos");
        n = teclado.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println("digite el elemento numero: " + i);
            v[i] = teclado.nextInt();
        }
        total = perfecto(v, n, 1, 0);
        System.out.println("la suma de los numeros perfectos es " + total);
    }

    public static int perfecto(int v[], int n, int j, int suma) {
        if (j <= n) {

            return perfecto(v, n, j + 1, suma + per(1, v[j], 0));
        }
        return suma;
    }

    public static int per(int j, int v, int suma) {
        if (j > v) {
            return suma;
        }
        if (j < v) {
            if (v % j == 0) {
                suma += j;
            }
            return per(j + 1, v, suma);
        }
        if (suma == v) {
            return suma;
        } else {
            suma = 0;
        }
        return suma;
    }
}
