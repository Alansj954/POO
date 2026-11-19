package Baralho;

public class Carta {

    private Naipe naipe;
    private Valor valor;


    public Carta(Naipe naipe, Valor valor){
        this.naipe = naipe;
        this.valor = valor;
    }

    public String nomeDaImagem(){
        return "1c";
    }


    @Override
    public String toString() {
        return this.valor.simbolo + this.naipe.inicial + ".png";
    }






}
