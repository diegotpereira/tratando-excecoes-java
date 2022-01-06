import java.util.Scanner;

public class ExemploRuntimeException {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro.");
        int numero = teclado.nextInt();

        System.out.println("Número lido: " + numero);

        teclado.close();
    }
}
