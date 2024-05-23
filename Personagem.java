public class Personagem {
    private final int dano;
    private final int resistencia;
    private final int vida;
    private final int mana;
    private final String arma;
    private final String poder;

    public Personagem(int dano, int resistencia, int vida, int mana, String arma, String poder) {
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

    public String getArma() {
        return arma;
    }

    public String getPoder() {
        return poder;
    }
}
