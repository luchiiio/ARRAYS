
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, m;

        System.out.print("Introduce las filas: ");
        n = sc.nextInt();

        System.out.print("Introduce las columnas: ");
        m = sc.nextInt();

        int[][] matriz = new int[n][m];
        int[][] resultado = new int[3][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Introduce un numero: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {

            int suma = 0;
            int mayor = matriz[0][j];
            int menor = matriz[0][j];

            for (int i = 0; i < n; i++) {

                suma = suma + matriz[i][j];

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }

            resultado[0][j] = suma;
            resultado[1][j] = mayor;
            resultado[2][j] = menor;
        }

        System.out.println("Matriz de resultados:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
