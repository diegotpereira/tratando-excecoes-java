import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploRuntimeException2 {
    public static void main(String[] args) {
        int numero = 0;
        boolean validado = false;

        while (!validado) {
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Digite um número inteiro: ");
                numero = teclado.nextInt();

                validado = true;
            } catch (InputMismatchException ex) {
                System.out.println("O valor inserido não é um número inteiro!");
            }
        }
        System.out.println("O valor lido foi: " + numero);
    }
}
