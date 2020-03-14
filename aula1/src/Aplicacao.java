package aula1;

public class Aplicacao {
    public static void main(String[] args) {
        Calculadora calculadoraDeIdades = new Calculadora ();
        int somaDasIdades = calculadoraDeIdades.multiplica (40, 30);
                System.out.println(somaDasIdades);

                Comparador comparadorDeIdades = new Comparador ();
                boolean comparacao = comparadorDeIdades.menorQue(15,99);
    }
}
