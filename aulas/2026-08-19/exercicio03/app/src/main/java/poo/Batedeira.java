package poo;

public class Batedeira {

    private boolean tampa;
    private String pa;
    private boolean bacia;
    private boolean botao;

    public void abrirTampa(){
        if(tampa == false){
            tampa = true;
            System.out.println("Tampa aberta");
        }
    }

    public void fecharTampa(){
        if(tampa == true){
            tampa = false;
            System.out.println("Tampa fechada");
        }
    }

    public String selecionarPa(){
        pa = "Pá para massa de pão";
        return pa;    
    } 

    public void encaixarBacia(){
        if(tampa == true && bacia == false){
            bacia = true;
            System.out.println("Bacia encaixada");
        }
    }

    public void desencaixarBacia(){
        if(tampa == true && bacia == true){
            bacia = false;
            System.out.println("Bacia desencaixada");
        }
    }
    
    public void ligarBatedeira(){
        if(botao == false && bacia == true && tampa == false){
            botao = true;
            System.out.println("Batedeira ligada");
        }
    }

    public void desligarBatedeira(){
        if(botao == true){
            botao = false;
            System.out.println("Batedeira desligada");
        }
    }
}
