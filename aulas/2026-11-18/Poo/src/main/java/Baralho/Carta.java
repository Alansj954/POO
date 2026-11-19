package Baralho;

public class Carta {

    protected Naipe naipe;
    protected Valor valor;


    public Carta(Naipe naipe, Valor valor){
        this.naipe = naipe;
        this.valor = valor;
    }

    public String nomeDaImagem(){
        return "1c";
    }


    @Override
    public String toString() {
        return valor + "" + naipe;
    }






}
