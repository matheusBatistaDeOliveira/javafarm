package br.com.joaocarloslima.Entity.Lugar;

import br.com.joaocarloslima.Entity.Terreno;
import java.util.List;
import java.util.ArrayList;

public class Fazenda {
    private Celeiro celeiro;
//    private List<Terreno> terrenos = new ArrayList<Terreno>();
//
//    Terreno terreno1 = new Terreno(20, 20);
//
//    terrenos.add(terreno1);

    public List<Terreno> getTerrenos(int x, int y) {
        return terrenos;
    }

    public void setTerrenos(List<Terreno> terrenos) {
        this.terrenos = terrenos;
    }
}
