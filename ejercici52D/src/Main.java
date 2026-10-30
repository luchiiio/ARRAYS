
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[20][6];

        for (int i = 0; i < 20; i++) {

            System.out.println("Alumno " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce una nota: ");
                notas[i][j] = sc.nextDouble();
            }
        }

        double mejor = notas[0][0];
        double peor = notas[0][0];

        for (int i = 0; i < 20; i++) {

            double suma = 0;
            double mayor = notas[i][0];
            double menor = notas[i][0];

            for (int j = 0; j < 3; j++) {

                suma = suma + notas[i][j];

                if (notas[i][j] > mayor) {
                    mayor = notas[i][j];
                }

                if (notas[i][j] < menor) {
                    menor = notas[i][j];
                }

                if (notas[i][j] > mejor) {
                    mejor = notas[i][j];
                }

                if (notas[i][j] < peor) {
                    peor = notas[i][j];
                }
            }

            notas[i][3] = suma / 3;
            notas[i][4] = mayor;
            notas[i][5] = menor;
        }

        System.out.println("RESULTADOS:");

        for (int i = 0; i < 20; i++) {

            for (int j = 0; j < 6; j++) {
                System.out.print(notas[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println("Mejor nota del curso: " + mejor);
        System.out.println("Peor nota del curso: " + peor);

        sc.close();
    }
}
