
package practica2arreglosbidimensionalesu4;

public class Practica2ArreglosBidimensionalesU4 {

    public static void main(String[] args) {
        char[][] arreglo = new char[3][5];
        
        char letra = 'a';
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arreglo[i][j] = letra;
                letra++;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
