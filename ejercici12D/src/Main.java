
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de filas: ");
        int n = sc.nextInt();

        System.out.print("Introduce el numero de columnas: ");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        int[] sumaColumnas = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Introduce el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz introducida:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }

        System.out.println("Suma de cada columna:");

        for (int j = 0; j < m; j++) {
            System.out.println("Columna " + (j + 1) + ": "
                    + sumaColumnas[j]);
        }

    }
}
