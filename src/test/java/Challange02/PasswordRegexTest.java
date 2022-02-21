package Challange02;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordRegexTest {
    PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    @Order(1)
    void validatePassword_EmptyString() {
        assertFalse(passwordValidator.validate(""));
        System.out.println("O resultado é inválido: " + passwordValidator.validate("") +
                " - Campo requerido. Digite sua senha!");
    }

    @Test
    @Order(2)
    void validatePassword_LengthTooShort() {    // too short, minimum 6 characters
        assertFalse(passwordValidator.validate("ase#1"));
        System.out.println("O resultado é inválido: " + passwordValidator.validate("ase#1") +
                " - Digite no mínimo 6 caracteres para sua senha ser válida.");
    }

    @Test
    @Order(3)
    void validatePassword_LengthTooLong() {    // too short, max 20 characters
        assertFalse(passwordValidator.validate("ase1231231231adaasdadsq*&¨%&%#1"));
        System.out.println("O resultado é inválido: " + passwordValidator.validate("ase1231231231adaasdadsq*&¨%&%#1") +
                " - Digite uma senha com no mínimo 20 caracteres para sua senha ser válida.");
    }

    @Test
    @Order(4)
    void validatePassword_NotSpecialCharacters() {    // Password without special characters
        assertFalse(passwordValidator.validate("Ass123"));
        System.out.println("O resultado é inválido: " + passwordValidator.validate("Ass#12") +
                " - Digite pelo menos 1 caracter espacial [!@#$%^&*()-+]");
    }

    @Test
    @Order(5)
    void validatePassword_Correct() {    // Password valid
        assertTrue(passwordValidator.validate("Lordes@+12"));
        System.out.println("O resultado é inválido: " + passwordValidator.validate("Lordes@+12") +
                " - Parábens, senha válida");
    }
}