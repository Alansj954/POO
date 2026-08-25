package poo;

public class Contador {

    private int valorAtual;

    public void atribuirValor( int valor){
        valorAtual = valor;
    }

    public void incrementarValor (){
        valorAtual++;
    }

    public int obterValorAtual(){
        return valorAtual;
    }
}