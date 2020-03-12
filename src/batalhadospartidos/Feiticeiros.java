package batalhadospartidos;

public class Feiticeiros {
    String nomeDoFeiticeiro;
    int vida;
    int ataque;
    int defesa;
    int mana;

    public Feiticeiros(String nomeDoFeiticeiro, int vida, int ataque, int defesa, int mana){
        this.nomeDoFeiticeiro = nomeDoFeiticeiro;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }


    public void sofrerDano7(int dano){
        int vidaAposDano = this.vida - dano;

        this.vida = vidaAposDano;
    }
    public boolean estaMorto6(){
        return vida <= 0;
    }

    public int atacar(Druidas druidas, Magias magias){
        int dano = (magias.poderDaMagia * ataque) - druidas.defesa;
        if (dano < 0){
            return 0;
        }
        return dano;
    }

    public int atacar2(Guerreiro guerreiro, Magias magias){
        int dano = (magias.poderDaMagia * ataque) - guerreiro.defesa;
        if (dano < 0){
            return 0;
        }
        return dano;
    }

    public void sofrerDano2(int dano){
        int vidaAposDano = this.vida - dano;

        this.vida = vidaAposDano;
    }
    public boolean estaMorto2(){
        return vida <= 0;
    }
}
