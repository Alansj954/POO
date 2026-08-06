import java.util.Scanner;

// Ler duas notas de 3 pessoas e imprimir notas e media

public class MediaMatrizes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] matriz = new double[3][3];
        double notas;
        double[] media2 = new double[3];

        System.out.println("Entre com as notas das avaliação 1 e 2 dos três alunos");
        
        for(int i = 0; i < 3; i++){
            
            double media = 0;

            for(int j = 0; j < 3; j++){

                //Quando chegar na ultima coluna, o ultimo número daquela linha e o primeiro da coluna será a media
                if(j == 2){
                    matriz[i][j] = Math.round(media / 2.0);
                } 
                else {

                    notas = sc.nextDouble();
          
                    matriz[i][j] = notas;
                    media += matriz[i][j];
                }    
            }
        } 
        // String.format: Usando % define um espaço, o valor que vem em seguida indica a posiçção que ele vai ocupar e a letra indica o tipo de variavel
        System.out.print(String.format("%12s %5s %6s", "A1", "A2","Media"));
        
        for(int i = 0; i < 3; i++){
            System.out.println();
            System.out.print("Aluno " + (i+1));

            for(int j = 0; j < 3; j++){
                System.out.print(String.format("%6.1f", matriz[i][j]));
            }
        } 
        System.out.println();    
        System.out.print(String.format("%7s", "Media"));   

        for(int j = 0; j < 3; j++){

            for(int i = 0; i < 3; i++){
                media2[j] += matriz[i][j];
            }
        }

        for(int i = 0; i < 3; i++){
            media2[i] = Math.round(media2[i] / 3);

            System.out.print(String.format("%6.1f", media2[i]));
        }
        System.out.println();    
    }   
}
