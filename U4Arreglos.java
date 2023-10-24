
package u4arreglos;

import java.util.Scanner;

public class U4Arreglos {

    public static void main(String[] args) {
        double[] arreglo = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        Scanner scanner = new Scanner (System.in);
        
        boolean salir = false;
        while(!salir) {
            System.out.println("Seleccione una opcion: ");
            System.out.println("Opcion 1: Sumar elementos del arreglo");
            System.out.println("Opcion 2: Multiplicar los elementos del arreglo");
            System.out.println("Opcion 3: Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    double suma = 0.0;
                    for (int i = 0; i < arreglo.length;  i++) {
                        suma += arreglo[i];
                    }
                    System.out.println("La suma de los elementos del arreglo es de: " + suma);
                    
                    break;
                case 2:
                    double producto = 1.0;
                    for (int i = 0; i < arreglo.length; i++) {
                        producto *= arreglo[i];
                    }
                    System.out.println("El producto de la multiplicación de los arreglos de: " + producto);
                    
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    
                    System.out.println("Opcion no valida. Por favor seleccione una opcion valida.");
            }
        }
        System.out.println("¡Gracias por usar mi calculadora, ten un buen dia!");
    }
    
}
