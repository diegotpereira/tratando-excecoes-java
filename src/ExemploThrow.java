import java.util.Scanner;

public class ExemploThrow {

    public static final String SENHASECRETA = "123456";
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("Digite a senha: ");
            String senha = teclado.nextLine();

            if (!senha.equals(SENHASECRETA)) {
                
                throw new Exception("Senha inválida!");
            }

            System.out.println("Senha correta!\nBem vindo(a)!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
