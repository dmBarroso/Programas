package programas;
import java.util.Scanner;
public class escaleras {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el número de escalones: ");
            int escalones = scanner.nextInt();

            dibujarEscalera(escalones);
        }

        public static void dibujarEscalera(int escalones) {
            if (escalones > 0) {
                // Escalera ascendente
                for (int i = 0; i < escalones; i++) {
                    for (int j = 0; j < escalones - i - 1; j++) {
                        System.out.print("  ");
                    }
                    System.out.println(" _");
                    for (int j = 0; j < escalones - i - 1; j++) {
                        System.out.print("  ");
                    }
                    System.out.println("_|");
                }
            } else if (escalones < 0) {
                // Escalera descendente
                escalones = -escalones; // Convertir a positivo para iterar
                for (int i = 0; i < escalones; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("  ");
                    }
                    System.out.println(" _");
                    for (int j = 0; j < i; j++) {
                        System.out.print("  ");
                    }
                    System.out.println("_|");
                }
            } else {
                // Cuando el número de escalones es 0
                System.out.println("__");
            }
        }
    }
