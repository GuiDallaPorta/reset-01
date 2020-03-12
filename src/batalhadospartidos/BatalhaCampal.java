package batalhadospartidos;

public class BatalhaCampal {

    public static void main(String[] args) {

        Guerreiro lulinha = new Guerreiro("Lula", 100, 3, 5);
        Barbaros gominho = new Barbaros("Cid Gomes", 100, 4, 10);
        Magos maluf = new Magos("Maluf", 100, 5, 5, 100);
        Feiticeiros bolsominho = new Feiticeiros("Bolsonaro", 100, 3, 10, 100);
        Druidas brisola = new Druidas("Brisola", 100, 5, 12, 100);
        Clerigos marcofeliciano = new Clerigos("Marco Feliciano", 100, 4, 15, 100);

        Armas populismo = new Armas("Bolsa Família", 9);
        Magias magianegra = new Magias("Magia Negra", 3, 25);
        PoderesAleluia glorifica = new PoderesAleluia("Dízimo", 5, 10);


        while (maluf.vida > 0 && lulinha.vida > 0 && gominho.vida > 0 && bolsominho.vida > 0 && brisola.vida > 0 && marcofeliciano.vida >0) {

            int danoFinalDoAtaque = lulinha.atacar(maluf, populismo);
            maluf.sofrerDano(danoFinalDoAtaque);
            System.out.println("O Guerreiro " + lulinha.nomeDoGuerreiro + " atacou " + maluf.nomeDoMago + " com " + populismo.arma + " causando dano de " + danoFinalDoAtaque);
            System.out.println(maluf.nomeDoMago + " está com a vida " + maluf.vida);


            if (maluf.estaMorto2()) {
                System.out.println("Maluf morreu.");
                break;
            }

            else {

                int danoFinalDoAtaque2 = maluf.atacar(lulinha, magianegra);
                lulinha.sofrerDano(danoFinalDoAtaque2);
                System.out.println("O Mago " + maluf.nomeDoMago + " atacou " + lulinha.nomeDoGuerreiro + " com " + magianegra.magia + " causando dano de " + danoFinalDoAtaque2 + "e está com a mana de ");
                System.out.println(lulinha.nomeDoGuerreiro + " está com a vida " + lulinha.vida);

                if (lulinha.estaMorto()) {
                    System.out.println("Lula morreu.");
                    break;
                }

                int danoFinalDoAtaque3 = lulinha.atacar2(bolsominho, populismo);
                bolsominho.sofrerDano2(danoFinalDoAtaque3);
                System.out.println("O Guerreiro " + lulinha.nomeDoGuerreiro + " atacou " + bolsominho.nomeDoFeiticeiro + " com "+ populismo.arma + " causando dano de " + danoFinalDoAtaque3);
                System.out.println(bolsominho.nomeDoFeiticeiro + " está com a vida " + bolsominho.vida);

                if (bolsominho.estaMorto6()) {
                    System.out.println("Bolsonaro morreu.");
                    break;
                }

                int danoFinalDoAtaque4 = maluf.atacar2(gominho, magianegra);
                gominho.sofrerDano3(danoFinalDoAtaque4);
                System.out.println("O Mago " + maluf.nomeDoMago + " atacou " + gominho.nomeDoBarbaro + " com " + magianegra.magia + " causando dano de " + danoFinalDoAtaque4);
                System.out.println(gominho.nomeDoBarbaro + " está com a vida " + gominho.vida);

                if (gominho.estaMorto3()){
                    System.out.println("O Cid Gomes morreu");
                    break;
                }

                int danoFinalDoAtaque5 = gominho.atacar(marcofeliciano, populismo);
                marcofeliciano.sofrerDano6(danoFinalDoAtaque5);
                System.out.println("O Bárbaro " + gominho.nomeDoBarbaro + " atacou " + marcofeliciano.nomeDoClerigo + " com "+ populismo.arma + " causando dano de " + danoFinalDoAtaque5);
                System.out.println(marcofeliciano.nomeDoClerigo + " está com a vida " + marcofeliciano.vida);

                if (marcofeliciano.estaMorto4()) {
                    System.out.println("Marco Feliciano morreu");
                    break;
                }

                int danoFinalDoAtaque6 = gominho.atacar2(brisola, populismo);
                brisola.sofrerDano7(danoFinalDoAtaque6);
                System.out.println("O Bárbaro " + gominho.nomeDoBarbaro + " atacou " + brisola.nomeDoDruida + " com "+ populismo.arma + " causando dano de " + danoFinalDoAtaque6);
                System.out.println(brisola.nomeDoDruida + " está com a vida " + brisola.vida);

                if (brisola.estaMorto5()){
                    System.out.println("Brisola morreu");
                    break;
                }

                int danoFinalDoAtaque7 = marcofeliciano.atacar(bolsominho, glorifica);
                bolsominho.sofrerDano7(danoFinalDoAtaque7);
                System.out.println("O Clérigo " + marcofeliciano.nomeDoClerigo + " atacou " + bolsominho.nomeDoFeiticeiro + " com " + glorifica.nomeDoPoder + " causando dano de " + danoFinalDoAtaque7);
                System.out.println(bolsominho.nomeDoFeiticeiro + " está com a vida " + bolsominho.vida);


                if (bolsominho.estaMorto6()) {
                    System.out.println("Bolsonaro morreu.");
                    break;
                }

                int danoFinalDoAtaque8 = marcofeliciano.atacar2(gominho, glorifica);
                gominho.sofrerDano8(danoFinalDoAtaque8);
                System.out.println("O Clérigo " + marcofeliciano.nomeDoClerigo + " atacou " + gominho.nomeDoBarbaro + " com " + glorifica.nomeDoPoder + " causando dano de " + danoFinalDoAtaque8);
                System.out.println(gominho.nomeDoBarbaro + " está com a vida " + gominho.vida);

                if (gominho.estaMorto3()){
                    System.out.println("O Cid Gomes morreu");
                    break;
                }

                int danoFinalDoAtaque9 = brisola.atacar(maluf, glorifica);
                maluf.sofrerDano(danoFinalDoAtaque9);
                System.out.println("O Druida " + brisola.nomeDoDruida + " atacou " + maluf.nomeDoMago + " com " + glorifica.nomeDoPoder + " causando dano de " + danoFinalDoAtaque9);
                System.out.println(maluf.nomeDoMago + " está com a vida " + maluf.vida);

                if (maluf.estaMorto2()) {
                    System.out.println("Maluf morreu.");
                    break;
                }

                int danoFinalDoAtaque10 = brisola.atacar2(marcofeliciano, glorifica);
                marcofeliciano.sofrerDano(danoFinalDoAtaque10);
                System.out.println("O Druida " + brisola.nomeDoDruida + " atacou " + marcofeliciano.nomeDoClerigo + " com " + glorifica.nomeDoPoder + " causando dano de " + danoFinalDoAtaque10);
                System.out.println(marcofeliciano.nomeDoClerigo + " está com a vida " + marcofeliciano.vida);

                if (marcofeliciano.estaMorto4()) {
                    System.out.println("Marco Feliciano morreu");
                    break;
                }

                int danoFinalDoAtaque11 = bolsominho.atacar2(lulinha, magianegra);
                lulinha.sofrerDano(danoFinalDoAtaque11);
                System.out.println("O Feiticeiro " + bolsominho.nomeDoFeiticeiro + " atacou " + lulinha.nomeDoGuerreiro + " com " + magianegra.magia + " causando dano de " + danoFinalDoAtaque11);
                System.out.println(lulinha.nomeDoGuerreiro + " está com a vida " + lulinha.vida);

                if (lulinha.estaMorto()) {
                    System.out.println("Lula morreu.");
                    break;
                }

                int danoFinalDoAtaque12 = bolsominho.atacar(brisola, magianegra);
                brisola.sofrerDano(danoFinalDoAtaque12);
                System.out.println("O Feiticeiro " + bolsominho.nomeDoFeiticeiro + " atacou " + brisola.nomeDoDruida + " com " + magianegra.magia + " causando dano de " + danoFinalDoAtaque12);
                System.out.println(brisola.nomeDoDruida + " está com a vida " + brisola.vida);

                if (brisola.estaMorto5()){
                    System.out.println("Brisola morreu");
                    break;
                }
            }
        }
    }
}

