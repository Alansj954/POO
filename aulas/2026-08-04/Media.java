import java.util.Scanner;

public class Media{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Entre com duas notas");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();

        media = Math.round((nota1 + nota2) / 2);

        System.out.println("Media: " + media);

        if (media >= 6){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();

    }
}

// Inicia com letra maiuscula = classe. Fornece metodos colocando o "." após a variavel
// foreach loop de vetor

