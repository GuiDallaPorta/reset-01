package aula1.batalhadospartidos;

public class Clerigos {
    String nomeDoClerigo;
    int vida;
    int ataque;
    int defesa;
    int fe;

    public Clerigos(String nomeDoClerigo, int vida, int ataque, int defesa, int fe){
        this.nomeDoClerigo=nomeDoClerigo;
        this.vida=vida;
        this.ataque=ataque;
        this.defesa=defesa;
        this.fe=fe;
    }


    public void sofrerDano6(int dano){
        int vidaAposDano = this.vida - dano;

        this.vida = vidaAposDano;
    }

    public int atacar(Feiticeiros feiticeiros, PoderesAleluia poderesaleluia){
        int dano = (poderesaleluia.intensidade * ataque ) - feiticeiros.defesa;
        if (dano < 0){
            return 0;
        }
        return dano;
    }

    public int atacar2(Barbaros barbaros, PoderesAleluia poderesaleluia2){
        int dano = (poderesaleluia2.intensidade * ataque) - barbaros.defesa;
        if (dano < 0){
            return 0;
        }
        return dano;
    }
    public void sofrerDano(int dano){
        int vidaAposDano = this.vida - dano;

        this.vida = vidaAposDano;
    }
    public boolean estaMorto4(){
        return vida <= 0;
    }
}
