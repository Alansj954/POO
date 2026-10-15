package poo;

import poo.Produtos.Semfio;
import poo.Produtos.Telefone;

public class Main {
    public static void main(String[] args) {

        Telefone tel = new Telefone(1,"","",1,new Dimensao(1,1,1));

        Semfio sf = new Semfio(1,"","",1,new Dimensao(1,1,2),1,1,1);

        IO.println(tel);
        IO.print(sf);


    }




}
