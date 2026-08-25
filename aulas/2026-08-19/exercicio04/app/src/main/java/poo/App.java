
package poo;

public class App {
    
    public static void main(String[] args) {
        
        Disciplina poo = new Disciplina();

        poo.definirTempo("Um semestre");
        poo.definirProfessor("Mello");
        poo.definirConteudo("Introdução a Classes, objetos, metodos e atributos");
        poo.definirLocal("Lab redes");

        poo.visualizarInformacoes();
        
    }
}
