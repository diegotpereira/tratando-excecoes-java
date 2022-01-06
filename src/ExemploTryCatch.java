import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {

            System.out.println("Digite um valor inteiro.");
            int numero1 = teclado.nextInt();

            System.out.println("Digite um valor inteiro.");
            int numero2 = teclado.nextInt();

            System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));

        } catch (Exception e) {
            //Exibindo a exceção
            System.out.println("ERRO - Valor digitado não é um número inteiro!");
        }
    }
}
