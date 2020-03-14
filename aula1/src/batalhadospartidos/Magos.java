package aula1.batalhadospartidos;

public class Magos {
    String nomeDoMago;
    int vida;
    int ataque;
    int defesa;
    int mana;

    public Magos(String nomeDoMago, int vida, int ataque, int defesa, int mana) {
        this.nomeDoMago = nomeDoMago;
        this.vida = vida;
        this.ataque = ataque;
        this.mana = mana;

    }
    public void sofrerDano(int dano){
        int vidaAposDano = this.vida - dano;

        this.vida = vidaAposDano;
    }
    public boolean estaMorto2(){
        return vida <= 0;
    }
    public int atacar(Guerreiro guerreiros, Magias magias) {
        int dano = (magias.poderDaMagia * ataque) - guerreiros.defesa;
        this.mana = this.mana - magias.custoDaMagia;
        if (dano < 0) {
            return 0;
        }
            return dano;
        }

    public int atacar2(Barbaros barbaros, Magias magias2){
        int dano = (magias2.poderDaMagia * ataque) - barbaros.defesa;
        if (dano < 0){
            return 0;
        }
        return dano;
    }

    }

