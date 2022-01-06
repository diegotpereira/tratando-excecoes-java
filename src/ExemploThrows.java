import java.util.Scanner;

public class ExemploThrows {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            ExemploThrows exemploThrows = new ExemploThrows();

            System.out.println("Digite o valor do dividendo: ");
            double dividendo = teclado.nextDouble();

            System.out.println("Digite o valor do divisor: ");
            double divisor = teclado.nextDouble();

            double resultado = exemploThrows.dividir(dividendo, divisor);

            System.out.println("O resultado da divisão é: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public double dividir(double dividendo, double divisor) throws Exception {
        if (divisor == 0) {
            
            throw new Exception("Não é permitido fazer uma divisão por zero.");
        }
        return dividendo / divisor;
    }
}
