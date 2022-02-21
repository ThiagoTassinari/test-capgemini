package Challange02;

import java.util.Scanner;

public class PasswordRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String name, password = "";
        System.out.println("Digite seu nome:");
        name = sc.nextLine();

        System.out.println("Digite sua senha: ");
        password = sc.nextLine();

        PasswordValidator passwordValidator = new PasswordValidator();

        while(true) {
            if(password.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{6,20}")) {
                System.out.println("Parábens " + name + " você foi cadastrado(a) com sucesso!");
                break;
            } else {
                System.out.println("Senha inválida, tente novamente.");
                password = sc.nextLine();
            }
        }
    }
}
