package br.com.joaocarloslima.Entity.Lugar;

public class Celeiro {
    //inventário
    private int capacidade = 20;
    private int qtdeBatatas = 3;
    private int qtdeCenouras = 3;
    private int qtdeMorangos = 3;


    public Celeiro() {
    }

    public Celeiro(int capacidade) {
        this.capacidade = capacidade;
    }
    public void armazenarBatata() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("Não há espaço no celeiro");
        }
        qtdeBatatas += 2;
    }

    public void armazenarCenoura() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("Não há espaço no celeiro");
        }
        qtdeCenouras += 2;
    }

    public void armazenarMorango() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("Não há espaço no celeiro");
        }
        qtdeMorangos += 2;
    }

    public void consumirBatata() {
        if (qtdeBatatas == 0) {
            throw new RuntimeException("Não há batatas no celeiro");
        }
        qtdeBatatas--;
    }

    public void consumirCenoura() {
        if (qtdeCenouras == 0) {
            throw new RuntimeException("Não há cenouras no celeiro");
        }
        qtdeCenouras--;
    }

    public void consumirMorango() {
        if (qtdeMorangos == 0) {
            throw new RuntimeException("Não há morangos no celeiro");
        }
        qtdeMorangos--;
    }

    public int getEspacoDisponivel() {
        return capacidade - (qtdeBatatas + qtdeCenouras + qtdeMorangos);
    }

    public int getOcupacao() {
        return (qtdeBatatas + qtdeCenouras + qtdeMorangos) / capacidade;
    }

    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }
}
