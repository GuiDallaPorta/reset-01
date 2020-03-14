package aula2.heranca;

public class Navio extends Veiculos {
    Double numeroDeCasosComCoronavirus;

    public Navio(String nome, String cor, Double peso, int capacidadeDePassageiros, Double velocidadeMaxima, String terreno, Double combustivel, Double numeroDeCasosComCoronavirus) {
        super(nome, cor, peso, capacidadeDePassageiros, velocidadeMaxima, "aquático", combustivel);
        this.numeroDeCasosComCoronavirus = numeroDeCasosComCoronavirus;
    }
}
