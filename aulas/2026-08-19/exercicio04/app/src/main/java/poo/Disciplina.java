package poo;

public class Disciplina {

    private String duracao;
    private String professor;
    private String conteudo;
    private String local;

    public String definirTempo(String tempo){
        duracao = "Um semestre";
        return duracao;
    }

    public String definirProfessor(String nome){
        professor = nome;
        return professor;
    }

    public String definirConteudo(String materia){
        conteudo = materia;
        return conteudo;
  
    }

    public String definirLocal(String sala){
        local = sala;
        return local;
    }

     public void visualizarInformacoes(){
        System. out.println(duracao);
        System. out.println(professor);
        System. out.println(conteudo);
        System. out.println(local);
    }
 
}
