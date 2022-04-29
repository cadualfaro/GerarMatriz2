/*
Matriz 2

0	1	4	9	16	25	36
0	1	4	9	16	25	36
0	1	4	9	16	25	36
 */
package matriz2;
import java.util.Arrays;
public class Matriz2 {

    public static void main(String[] args) {
        System.out.println("Matriz");
            
    int matriz [][] = new int [3][7];
    
        for (int i=0;i<matriz.length;i++)
            for (int j=0;j<matriz[i].length; j++){
                matriz [i][j] = j*j;
            }
        for (int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    
}
