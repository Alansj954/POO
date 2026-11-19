package Baralho;


import edu.princeton.cs.algs4.Draw;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {


        ArrayList<Carta> baralho = new ArrayList<>();

        for(Naipe n: Naipe.values()){
            for(Valor v: Valor.values()){
               baralho.add(new Carta(n,v));
            }
        }
        Draw draw = new Draw();
        draw.setCanvasSize(800,800);
        draw.setXscale(0,800);
        draw.setYscale(0,800);


        CartaGrafica c = new CartaGrafica(Naipe.COPAS, Valor.TRES, 400,400);
        c.desenhar(draw);






        draw.picture(.5,.5,"cartas/1o.png");

        //Imprimir o arquivo referente ao nome da imagem do arquivo

        //https://github.com/emersonmello/algs4

        IO.println(baralho.getFirst(.nomeDaImagem));
    }
}
