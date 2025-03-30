package ldp_test;

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
        int limiteTentativas = 10;

        System.out.println("Bem-vindo ao Jogo da Adivinhação Engraçada!!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        System.out.println("Você tem " + limiteTentativas + " tentativas para acertar. Boa sorte!");

        while (!acertou && tentativas < limiteTentativas) {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa == numeroSecreto) {
                acertou = true;
                System.out.println("Parabéns, você acertou o número! 🎉");
                System.out.println("Você conseguiu em " + tentativas + " tentativas! Você é um gênio!");
            } else if (tentativa < numeroSecreto) {
                System.out.println("O número secreto é maior... 😜");
            } else {
                System.out.println("O número secreto é menor... 😱");
            }

            // Surpresa aleatória a cada 3 tentativas erradas
            if (tentativas % 3 == 0 && tentativas < limiteTentativas) {
                System.out.println("Dica extra: O número secreto não é 42! 😅");
            }
        }

        if (!acertou) {
            System.out.println("Você não conseguiu! O número secreto era " + numeroSecreto + " 😔.");
            System.out.println("Mas não desanime, você pode tentar novamente. Talvez na próxima você acerte... ou não! 😉");
        }

        scanner.close();
    }
}
