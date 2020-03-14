package aula2.heranca;

public class Carro extends Veiculos {
    int numeroDeRodas;
    int numeroDePortas;
    int numeroDeMarchas;


    public Carro(String nome, String cor, Double peso, int capacidadeDePassageiros, Double velocidadeMaxima, String terreno, Double combustivel, int numeroDeRodas, int numeroDePortas, int numeroDeMarchas) {
        super(nome, cor, peso, capacidadeDePassageiros, velocidadeMaxima, "terrestre", combustivel);
        this.numeroDeRodas = numeroDeRodas;
        this.numeroDePortas = numeroDePortas;
        this.numeroDeMarchas = numeroDeMarchas;
    }
}
