package poo;

import java.util.HashMap;
import java.util.Scanner;

// variavel var

public class Main {

    Scanner sc = new Scanner(System.in);


    private HashMap<String, Livro> livros = new HashMap<>();

    public void cadastrar(){

    IO.println("Entre com o ISBN");
    String isbn = sc.next();

    if(livros.containsKey(isbn)){
        IO.println("ISBN já utilizada");

    } else {




    }


    }














    /*public static void main(String[] args) {


      HashMap<String, String> mapa = new HashMap<>();

       mapa.put("123", "Juca");
       mapa.put("456", "Ana");
       mapa.put("789", "Pedro");

       String nome = mapa.get("456");

       if(nome == null){
       IO.println("nao encontrado");

       } else {
           IO.println(nome + "\n");
       }

       mapa.forEach((chave, valor) -> IO.print("chave: " + chave + ", valor: " + valor ));


    for(var elemento : mapa.entrySet()){
        IO.println("chave: " + elemento.getKey());
        IO.println("valor: " + elemento.getValue());
    }

    mapa.remove("456"); // Remoção pela chave

    mapa.values().removeIf(e->e.equals("juca")); //remove todos com o valor igual a juca

       // classe livro
       //coleção de livros no app*/







    }
}
