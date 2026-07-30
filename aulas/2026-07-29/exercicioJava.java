import java.util.Scanner;

public class exercicioJava {

     /* Faça um programa que o usuário deve informar:
     - Sigla da disciplina
     - Todos os dias da semana que tem aula dessa disciplina
    
     Por fim, imprima:
     Na disciplina **** você tem aula nos seguintes dias:
     - seg
     - qua
     - sex*/

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        String sigla;
        String[] dias = new String[5];
        int i = 0;
        String d ="";

        System.out.println("Entre com a sigla da discliplina");
            sigla= sc.next();

    do {

      System.out.println("Entre com o dia da semana ou não para encerrar");

      switch(d){
        case "seg","ter", "qua", "qui","sex":
        dias[i] = d;
        break;
        case "nao":
        break;
        default:
            System.out.println("valor invalido");
            break;
        }

      i++;
    } while(i < 5);

    for (int j = 0; j<i; j++){      
        System.out.println(dias[j]);
    }
        

    }
    
}
