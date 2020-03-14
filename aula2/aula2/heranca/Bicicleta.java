package aula2.heranca;

public class Bicicleta extends Veiculos {
    int numeroDeRodas;

    public Bicicleta(String nome, String cor, Double peso, int capacidadeDePassageiros, Double velocidadeMaxima, String terreno, Double combustivel, int numeroDeRodas) {
        super(nome, cor, peso, capacidadeDePassageiros, velocidadeMaxima, "terrestre", combustivel);
        this.numeroDeRodas = numeroDeRodas;
    }
}
