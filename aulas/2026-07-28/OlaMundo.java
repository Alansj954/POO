import java.util.Scanner;

public class OlaMundo {
    public static void main(String args[]){
        System.out.println("Ola mundo");

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a sua idade");
        int idade = sc.nextInt();

        System.out.println("Entre com o seu sexo");
        char sexo =sc.next().charAt(0);

        if(sexo == 'm' && idade >= 18){
            System.out.println("Precisa apresentar o comprovante");

        } else if(sexo == 'f'){
            System.out.println("Precisa apresentar o comprovante");

        } else {
            System.out.println("Não precisa apresentar o comprovante");
        }





    }
}