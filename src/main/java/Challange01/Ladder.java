package Challange01;

/*
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
 * A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
 *
 */

import java.util.Scanner;

public class Ladder {

    public static void main(String[] args) {

        int asterisc = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Descreva quantos andares a escada vai ter: ");
        asterisc = keyboard.nextInt();
        System.out.println(" ");

        for(int i = 1; i <= asterisc; i++) {
            for(int j = 1; j <= asterisc - i; j++) {
                System.out.print(' ');
            }
            for(int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
        keyboard.close();
    }
}
