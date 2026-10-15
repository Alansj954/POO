package poo.Produtos;

import poo.Dimensao;

public class Semfio extends Telefone {

    private double frequencia;
    private int canais;
    private double distanciaOperacao;


    public Semfio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double
            distanciaOperacao) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public double getDistanciaOperacao() {
        return distanciaOperacao;
    }

    public void setDistanciaOperacao(double distanciaOperacao) {
        this.distanciaOperacao = distanciaOperacao;
    }

    @Override
    public String toString() {
        return "Semfio: " +
                "frequencia= " + frequencia +
                ", canais= " + canais +
                ", distanciaOperacao= " + distanciaOperacao;
    }



}
