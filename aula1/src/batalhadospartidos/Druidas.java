package aula1.batalhadospartidos;

public class Druidas {
    String nomeDoDruida;
    int vida;
    int ataque;
    int defesa;
    int fe;

    public Druidas(String nomeDoDruida, int vida, int ataque, int defesa, int fe){
        this.nomeDoDruida=nomeDoDruida;
        this.vida=vida;
        this.ataque=ataque;
        this.defesa=defesa;
        this.fe=fe;
    }

    public void sofrerDano(int dano){
        int vidaAposDano = this.vida - dano;

        this.vida = vidaAposDano;
    }
    public boolean estaMorto5(){
        return vida <= 0;
    }

    public int atacar(Magos magos, PoderesAleluia poderesaleluia){
        int dano = (poderesaleluia.intensidade * ataque) - magos.defesa;
        if (dano < 0){
            return 0;
        }
        return dano;
    }


    public int atacar2(Clerigos clerigos, PoderesAleluia poderesaleluia){
        int dano = (poderesaleluia.intensidade * ataque) - clerigos.defesa;
        if (dano < 0){
            return 0;
        }
        return dano;
    }

    public void sofrerDano7(int dano){
        int vidaAposDano = this.vida - dano;

        this.vida = vidaAposDano;
    }
}
