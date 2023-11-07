import java.util.Scanner;

public class Piramides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Bienvenido al menu de opciones:");
            System.out.println("1. Piramide de Asteriscos");
            System.out.println("2. Piramide de Numeros y Letras");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Por favor ingrese el numero de filas que desea ver en la piramide: ");
                    int filasAsteriscos = scanner.nextInt();
                    PiramideAsteriscos(filasAsteriscos);
                    break;
                case 2:
                    System.out.print("Por favor ingrese el numero de filas que desea ver en la piramide: ");
                    int filasNumerosLetras = scanner.nextInt();
                    PiramideNumerosLetras(filasNumerosLetras);
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elija otra opcion");
                    break;
            }
        } while (opcion != 0);
        
        scanner.close();
    }

    public static void PiramideAsteriscos(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void PiramideNumerosLetras(int filas) {
        int numero = 1;
        char letra = 'A';

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    System.out.print(numero);
                    numero++;
                } else {
                    System.out.print(letra);
                    letra++;
                }
            }
            System.out.println();
        }
    }
}
