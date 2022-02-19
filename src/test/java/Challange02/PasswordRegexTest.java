package Challange02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordRegexTest {



    @Test
    void main () {
        PasswordValidator passwordValidator = new PasswordValidator();

        /*
         *  empty password
         */
        System.out.println("'' is valid? = "+passwordValidator.validate(""));

        /*
         *  too short, minimum 6 characters
         */
        System.out.println("'p1AB@' is valid? = "+passwordValidator.validate("p1AB@"));

        /*
         *  uppercase characters is required
         */
        System.out.println("'peter1@' is valid? = "+passwordValidator.validate("peter1@"));


        /*
         *  special symbol “*” is not allow here
         */
        System.out.println("'peterAB2*' is valid? = "+passwordValidator.validate("peterAB2*"));

        /*
         *  digit is required
         */
        System.out.println("'peterAB$' is valid? = "+passwordValidator.validate("peterAB$"));


        /*
         *  lower case character is required
         */
        System.out.println("'PETER2$' is valid? = "+passwordValidator.validate("PETER2$"));
    }
}