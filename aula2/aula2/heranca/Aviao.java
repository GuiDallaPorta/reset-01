package aula2.heranca;

public class Aviao extends Veiculos {
    int numeroDeRodas;
    Double altitudeMaxima;

    public Aviao(String nome, String cor, Double peso, int capacidadeDePassageiros, Double velocidadeMaxima, String terreno, Double combustivel, int numeroDeRodas, Double altitudeMaxima) {
        super(nome, cor, peso, capacidadeDePassageiros, velocidadeMaxima, "aéreo", combustivel);
        this.numeroDeRodas = numeroDeRodas;
        this.altitudeMaxima = altitudeMaxima;
    }
}
