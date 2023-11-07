
package arrsolofilas;

public class ArrSoloFilas {

    public static void main(String[] args) {
        int [][] numeros = new int [4][];
        numeros [0] = new int [1];
        numeros [1] = new int [2];
        numeros [2] = new int [3];
        numeros [3] = new int [4];
        
        int k = 1;
        //System.out.println(numeros);
        
        System.out.println(numeros.length);
        //Guardar
        for ( int i = 0; i < numeros.length; i++){ //Control de filas
            System.out.println(numeros[i].length);
            //numeros[0].length;
            for (int j = 0; j < numeros[i].length; j++) { //Control de columnas
                numeros [i][j] = k;
                k++;
            }
        }
        //Leer
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros [i][j] + " ");
            }
            System.out.println();
            
        }
    }
    
}
