package Baralho;


import java.util.ArrayList;

public class Main {
    static void main(String[] args) {


        ArrayList<Carta> baralho = new ArrayList<>();

        for(Naipe n: Naipe.values()){
            for(Valor v: Valor.values()){
               baralho.add(new Carta(n,v));
            }
        }
    

        //Imprimir o arquivo referente ao nome da imagem do arquivo

        //https://github.com/emersonmello/algs4

    }
}
