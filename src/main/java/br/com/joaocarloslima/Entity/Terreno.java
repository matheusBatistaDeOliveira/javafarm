package br.com.joaocarloslima.Entity;

import br.com.joaocarloslima.Entity.Plantacoes.*;
import br.com.joaocarloslima.Entity.Lugar.*;

public class Terreno {
    Batata batata;
    Cenoura cenoura;
    Morango morango;

    private int x;
    private int y;


    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Object plantar(Batata batata){
        this.batata = new Batata();
        return this.batata;
    }
    public Object plantar(Cenoura cenoura){
        this.cenoura = new Cenoura();
        return this.cenoura;
    }
    public Object plantar(Morango morango){
        this.morango = new Morango();
        return this.morango;
    }

    public Object colher(Celeiro celeiro){//AQUIIIIII
        return celeiro;
    }

    public boolean estaOcupado(){
        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
