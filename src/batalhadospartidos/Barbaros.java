package batalhadospartidos;

public class Barbaros {
    String nomeDoBarbaro;
    int vida ;
    int ataque;
    int defesa;

    public Barbaros(String nomeDoBarbaro, int vida, int ataque, int defesa) {
        this.nomeDoBarbaro = nomeDoBarbaro;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void sofrerDano3(int dano){
        int vidaAposDano = this.vida - dano;

        this.vida = vidaAposDano;
    }
    public boolean estaMorto3(){
        return vida <= 0;
    }

        public int atacar(Clerigos clerigos, Armas armas){
            int dano = (armas.poderDeAtaque * ataque) - clerigos.defesa;
            if (dano < 0){
                return 0;
            }
            return dano;
        }

    public int atacar2(Druidas druidas, Armas armas2){
        int dano = (armas2.poderDeAtaque * ataque) - druidas.defesa;
        if (dano < 0){
            return 0;
        }
        return dano;
    }

        public void sofrerDano8(int dano){
            int vidaAposDano = this.vida - dano;

            this.vida = vidaAposDano;
        }

        }


