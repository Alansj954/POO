
package poo;

public class App {
    
    // Conteúdos metodo construtor, sobrecarga de metodo, this
    // private, public, getter, setter, return, constantes, toString



    //metodo desenhar que recebe as coordenadas inicial e final
    //Se houver tinta sufuciente, debite o consumo e retorne qual foi o consumo (quanto de tinta foi debitado)
    //se não houver tinta suficiente, retorne -1
    //consumo da tinta 0.01% de 0% a 100%
    //Distancia entre dois pontos = raiz quadrada de (x2-x1)² + (y2-y1)²

    public static void main(String[] args) {

        Caneta a = new Caneta(50, "Preta");
        Caneta b = new Caneta(50);
        Caneta c = new Caneta();

        a.setCor("verde");

        IO.print(a.toString()); // ou apenas IO.print(a) (não precisaria informaro o toString)




        
    }






}
