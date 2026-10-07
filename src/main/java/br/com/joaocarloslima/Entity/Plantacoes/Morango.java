package br.com.joaocarloslima.Entity.Plantacoes;

public class Morango {
    private int tamanho = 1;
    private int tempoDeVida;
    private int tempoDeCrescimento = 4;

    public Morango() {
    }

    public Morango(int tempoDeCrescimento) {
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    public void crescer() {
        tempoDeVida += 1;
        if (tamanho < 4) {
            tamanho += 1;
        }
    }

    public boolean podeColher() {
        return tamanho == 4;
    }

    public String getImagem() {
        return "images/morango" +tamanho+ ".png";
    }
}
