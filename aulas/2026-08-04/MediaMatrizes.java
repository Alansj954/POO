import java.util.Scanner;

// Ler duas notas de 3 pessoas e imprimir notas e media

public class MediaMatrizes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] matriz = new double[3][3];
        double notas;

        for(int i = 0; i < 3 ; i++){
            
            for(int j = 0; j < 2; j++){
                System.out.println("Entre com as notas das avaliações");
            
            notas = sc.nextDouble();

            matriz[i][j] = notas; 

            }
            
        }    

    }
    
}
