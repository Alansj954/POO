package poo;


public class Caneta {

    private int nivelTinta;
    private String cor;
    

    private final double CONSUMO = 0.01;



    
    public Caneta(int nivelTinta, String cor) {
        this.nivelTinta = nivelTinta;
        this.cor = cor;
    }


    public Caneta(int nivelTinta) {
        this(nivelTinta,"azul");
    }


    public Caneta() {
        this(100);
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public String toString(){
        return "cor: " + cor + "\nTinta:" + nivelTinta;
    }

    StringBuilder sb = new StringBuilder();

    sb.append("oi");



    /*@Override
    public String toString() {
        return "Caneta [nivelTinta=" + nivelTinta + ", cor=" + cor + ", CONSUMO=" + CONSUMO + "]";
    }*/





        
    // metodo construtor, this, private, public, return




    
}
