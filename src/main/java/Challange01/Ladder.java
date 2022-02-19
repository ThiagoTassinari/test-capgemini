package Challange01;

/*
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
 * A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
 *
 */

import java.util.Scanner;

public class Ladder {

    public static void main(String[] args) {

        int asterisc = 0; 											//Nesse campo será armazenado o tamanho da escada

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Descreva quantos andares a escada vai ter: ");
        asterisc = keyboard.nextInt(); 						//Scanner do teclado sendo atribuído na variável asterisco
        System.out.println(" ");

        for(int i = 1; i <= asterisc; i++) {
            for(int j = 1; j <= asterisc - i; j++) {
                System.out.print(' '); 							//Espaço em branco sendo atribuído por toda a linha
            }
            for(int j = 1; j <= i; j++) {
                System.out.print('*');								//Asterisco sendo atribuído nos últimos espaços
            }
            System.out.println("");								//Salto de linha
        }
        keyboard.close();                                              //Fechamento do Scanner (teclado)
    }
}
