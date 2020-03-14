package aula2.heranca;

import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Crie seu próprio veículo!");
        System.out.println("Primeiro, escolha o tipo do veículo:");
        System.out.println("Use c minúsculo para escolher Caminhao, C maiúsculo para Carro");
        System.out.println("C - Carro");
        System.out.println("A - Aviao");
        System.out.println("N - Navio");
        System.out.println("S - Submarino");
        System.out.println("T - Trem");
        System.out.println("c - Caminhao");
        System.out.println("B - Bicicleta");

        System.out.print("Tipo: ");
        char tipo = scanner.next().charAt(0);

        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Cor: ");
        String cor = scanner.next();


        switch (tipo) {
            case 'N':

        }
    }
}
