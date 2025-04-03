/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ldp_test;

/**
 *
 * @author sofia
 */
import java.util.Random;
import java.util.Scanner;

public class Ldp_test {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;
        boolean acertou = false;
        
        System.out.println("Bem-vindo ao jogo da Adivinha!!");
        System.out.println("Tente adivinhar um numero entre 1 e 100.");
        
        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            tentativas++;
            
            if (tentativa == numeroSecreto) {
                acertou = true;
                System.out.println("Parabens! Voce acertou o numero em " + tentativas + " tentativas.");
            } else if (tentativa < numeroSecreto) {
                System.out.println("O numero secreto e maior!");
            } else {
                System.out.println("O numero secreto e menor!");
            }
        }
        
        scanner.close();
    }
}