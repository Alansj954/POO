package ads.poo;

public class Carro {
    //atributos
    private int velocidadeAtual;

    //metodos
    public void acelerar(int incremento){

        if(velocidadeAtual <= 100 ){
        velocidadeAtual += incremento;
        
        } else {
            velocidadeAtual = 100;
        }
    }
    
    public int obterVelocidadeAtual(){
        return velocidadeAtual;
    }

}