package main;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Disciplina poo = new Disciplina("POO",
                new DiaDaSemana[] {DiaDaSemana.TERCA, DiaDaSemana.QUARTA});


        Disciplina fei = new Disciplina("FEI", new DiaDaSemana[] {DiaDaSemana.TERCA, DiaDaSemana.SEXTA});
        Disciplina est = new Disciplina("EST", new DiaDaSemana[] {DiaDaSemana.QUARTA, DiaDaSemana.SEXTA});
        Disciplina rco = new Disciplina("RCO", new DiaDaSemana[] {DiaDaSemana.SEGUNDA, DiaDaSemana.QUINTA});

        ArrayList<Disciplina> disciplinas = new ArrayList<>();

        disciplinas.add(fei);
        disciplinas.add(est);
        disciplinas.add(rco);




            //1°
        //Sigla: POO
        // Dias cmo aula:
        // -terça-feira
        // -quarta-feira


                    //2°
        //Criar um arrayList e adicionar 3 disciplinas
        //Imprimir do arraylist apenas as siglas das disciplinas que acontecem determinado dia

    }
}
