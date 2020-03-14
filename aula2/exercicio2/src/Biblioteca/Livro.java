package Biblioteca;

public class Livro {
    public Categoria categoria;
    public String titulo;
    public String autor;
    public Status status;

    public Livro(Categoria categoria, String titulo, String autor, Status status) {
        this.categoria = categoria;
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
    }
}


