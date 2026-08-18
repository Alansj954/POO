package ads.poo;

public class Carro {
    //atributos
    private int velocidadeAtual;

    //metodos
    public void acelerar(int incremento){
        velocidadeAtual += incremento;

        if(velocidadeAtual >= 100){
            velocidadeAtual = 100;
        }
    }
    
    public int obterVelocidadeAtual(){
        return velocidadeAtual;
    }

}