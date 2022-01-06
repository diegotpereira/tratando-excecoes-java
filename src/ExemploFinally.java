import java.util.Scanner;

public class ExemploFinally {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            int dividendo;
            int divisor;

            System.out.println("Digite o valor do dividendo: ");
            dividendo = teclado.nextInt();

            System.out.println("Digite o valor do divisor: ");
            divisor = teclado.nextInt();

            if (divisor == 0) {
                
                throw new Exception("Não é permitido fazer uma divisão por zero!");
            }

            System.out.println(dividendo + " / " + divisor + " = " + (dividendo / divisor));

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Bloco Finally.");
        }
    }
}
