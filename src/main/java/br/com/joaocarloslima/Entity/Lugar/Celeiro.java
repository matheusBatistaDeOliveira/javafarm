package br.com.joaocarloslima.Entity.Lugar;

public class Celeiro {
    private int capacidade;
    private int qtdeBatatas;
    private int qtdeCenouras;
    private int qtdeMorangos;

    public void armazenarBatata(){

    }
    public void armazenarCenoura(){

    }
    public void armazenarMorango(){

    }

    public void consumirBatata(){

    }
    public void consumirCenoura(){

    }
    public void consumirMorango(){

    }

    public int getEspacoDisponivel(){
        return 0;
    }
    public int getOcupacao(){
        return 0;
    }

    public boolean celeiroCheio(){
        return false;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public int getCapacidade() {
        return capacidade;
    }


    public void setQtdeBatatas(int qtdeBatatas) {
        this.qtdeBatatas = qtdeBatatas;
    }
    public void setQtdeCenouras(int qtdeCenouras) {
        this.qtdeCenouras = qtdeCenouras;
    }
    public void setQtdeMorangos(int qtdeMorangos) {
        this.qtdeMorangos = qtdeMorangos;
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
