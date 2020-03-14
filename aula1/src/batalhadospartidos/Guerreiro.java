package aula1.batalhadospartidos;

public class Guerreiro {
    String nomeDoGuerreiro;
    int vida;
    int ataque;
    int defesa;

    public Guerreiro(String nomeDoGuerreiro, int vida, int ataque, int defesa) {
        this.nomeDoGuerreiro = nomeDoGuerreiro;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    public int atacar(Magos magos, Armas armas){
        int dano = (armas.poderDeAtaque * ataque) - magos.defesa;
        if (dano < 0){
            return 0;
        }
        return dano;
    }

    public int atacar2(Feiticeiros feiticeiros, Armas armas2){
        int dano = (armas2.poderDeAtaque * ataque) - feiticeiros.defesa;
        if (dano < 0){
            return 0;
        }
        return dano;
    }

    public void sofrerDano(int dano){
        int vidaAposDano = this.vida - dano;

        this.vida = vidaAposDano;
    }
    public boolean estaMorto(){
        return vida <= 0;
    }
}
