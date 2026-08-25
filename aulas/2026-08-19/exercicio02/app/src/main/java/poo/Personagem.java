package poo;

public class Personagem {

    private int nivel;
    private int forca;
    
    public void nivelinicial(int valor){
        nivel = valor;
    }

    public void aumentarNivel(){
         nivel += 10;
    }

    public int nivelAtual(){
        return nivel;
    }
    
    public void forcaInicial(int valor){
        forca = valor;
    }

    public void aumentarforca(){
        forca++;
    }
    
    public int forcaAtual(){
        return forca;
    }

}