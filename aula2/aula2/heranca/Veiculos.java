package aula2.heranca;

public class Veiculos {
    public String nome;
    public String cor;
    public Double peso;
    public int capacidadeDePassageiros;
    public Double velocidadeMaxima;
    public String terreno;
    public Double combustivel;

    public Veiculos(String nome, String cor, Double peso, int capacidadeDePassageiros, Double velocidadeMaxima, String terreno, Double combustivel) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.capacidadeDePassageiros = capacidadeDePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.terreno = terreno;
        this.combustivel = combustivel;
    }
}
