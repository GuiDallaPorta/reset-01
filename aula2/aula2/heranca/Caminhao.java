package aula2.heranca;

public class Caminhao extends Veiculos {
    int numeroDeRodas;

    public Caminhao(String nome, String cor, Double peso, int capacidadeDePassageiros, Double velocidadeMaxima, String terreno, Double combustivel, int numeroDeRodas) {
        super(nome, cor, peso, capacidadeDePassageiros, velocidadeMaxima, "terrestre", combustivel);
        this.numeroDeRodas = numeroDeRodas;
    }
}
