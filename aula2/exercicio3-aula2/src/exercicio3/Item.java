package exercicio3;

public class Item {
    public Segmento segmento;
    public String nome;
    public Integer quantidade;
    public Double valorUnitario;
    public Double valorTotal = valorUnitario * quantidade;

    public Item(Segmento segmento, String nome, Integer quantidade, Double valorUnitario, Double valorTotal) {
        this.segmento = segmento;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;

        Item item1 = new Item(Segmento.HIGIENE, "Sabonete Dove", 3, 4.5, 13.5);
        Item item2 = new Item(Segmento.ALIMENTACAO, "Doritos", 1, 7.0, 7.0);
        Item item3 = new Item(Segmento.LIMPEZA, "Pinho Sol", 4, 5.5, 22.0);


    }
}
