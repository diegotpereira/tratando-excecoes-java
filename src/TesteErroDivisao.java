import java.util.Scanner;

public class TesteErroDivisao {
    public static void main(String[] args) {
        
        try {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite o valor do dividendo: ");
            int numero1 = teclado.nextInt();

            System.out.println("Digite o valor do divisor: ");
            int numero2 = teclado.nextInt();

            TesteErroDivisao testeErroDivisao = new TesteErroDivisao();

            System.out.println("Resto: " + testeErroDivisao.restoDaDivisao(numero1, numero2));
        } catch (ErroDivisao e) {
            System.out.println(e.getMessage());
        }
    }
    public int restoDaDivisao(int dividendo, int divisor) throws ErroDivisao {
        if (divisor > dividendo) {
            throw new ErroDivisao();
        }
        return dividendo % divisor;
    }
}
