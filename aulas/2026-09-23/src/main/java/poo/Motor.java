package poo;

public class Motor {

    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor(int hp, int cilindros){
        this.hp = hp;
        this.cilindros = cilindros;
        this.giroAtual = 0;
    }

    public void acelerar(int valor){
        this.giroAtual = valor;
    }


}
