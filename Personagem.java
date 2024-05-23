public class Personagem {
    private final int dano;
    private final int resistencia;
    private final int vida;
    private final int mana;
    private final int arma;
    private final int poder;

    public Personagem(int dano, int resistencia, int vida, int mana, int arma, int poder) {
        this.dano = dano;
        this.resistencia = resistencia;
        this.vida = vida;
        this.mana = mana;
        this.arma = arma;
        this.poder = poder;
    }

    public int getDano() {
        return dano;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public int getArma() {
        return arma;
    }

    public int getPoder() {
        return poder;
    }
}
