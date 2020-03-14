package exercicio01;

public class Aluno {
    public void obterNota(){
        System.out.println("obter nota está acessível.");
    }
    private void montarCola(){
        System.out.println("montar cola nao está acessível");

    }
    private final String nome = "nomeDoAluno";


}
