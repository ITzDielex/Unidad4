
package arreglos;

public class U4ArreglosBidimensionales {


    public static void main(String[] args) {
        int[][]numeros = new int [4][5];
        int numero = 1;
        
        //Guardando información en arreglo unidimensionañ
        for (int i = 0; i < 4; i++) { //Control de filas
            for (int j = 0; j < 5; j++) { // control de columnas
                numeros[i][j] = numero;
                numero++;
                
            }
            
        }
        //Leyendo información en arreglo unidimensional
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
