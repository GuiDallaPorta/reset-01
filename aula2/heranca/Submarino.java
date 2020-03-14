package aula2.heranca;

public class Submarino extends Veiculos {
    Double profundidadeMaxima;

    public Submarino(String nome, String cor, Double peso, int capacidadeDePassageiros, Double velocidadeMaxima, String terreno, Double combustivel, Double profundidadeMaxima) {
        super(nome, cor, peso, capacidadeDePassageiros, velocidadeMaxima, "aquático", combustivel);
        this.profundidadeMaxima = profundidadeMaxima;
    }
}
