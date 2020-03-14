package Biblioteca;

public class App {
    public static void main(String[] args) {

        Livro livro1 = new Livro(Categoria.FANTASIA, "A torre negra: O pistoleiro", "(Stephen King)", Status.DISPONIVEL);
        Livro livro2 = new Livro(Categoria.ROMANCE, "100 escovadas antes de dormir", "(Melissa Paranello)", Status.EM_USO);
        Livro livro3 = new Livro(Categoria.SUSPENSE, "O código Da Vinci", "(Dan Brown", Status.DISPONIVEL);
        Livro livro4 = new Livro(Categoria.TERROR, "A Profecia", "(David Seltzer)", Status.EMPRESTADO);


        System.out.println(livro1.categoria + " - " + livro1.titulo + " " + livro1.autor + " " +livro1.status);
        System.out.println(livro2.categoria + " - " + livro2.titulo + " " + livro2.autor + " " +livro2.status);
        System.out.println(livro3.categoria + " - " + livro3.titulo + " " + livro3.autor + " " +livro3.status);
        System.out.println(livro4.categoria + " - " + livro4.titulo + " " + livro4.autor + " " +livro4.status);

        // trocar o sout por um método imprimir.

    }
}
