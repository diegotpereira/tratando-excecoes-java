import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoInput {
    public static void main(String[] args) {

        byte idade = - 1;

        while (idade < 10) {
            System.out.println("Informe sua idade:\t");

            Scanner teclado = new Scanner(System.in);

            try {
                idade = teclado.nextByte();
            } catch (InputMismatchException ime) {
                System.out.println("Idade inválida");
            }
        }
        System.out.println("Sua idade:\t\t" + idade);
    }
}
