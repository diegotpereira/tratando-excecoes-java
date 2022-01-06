public class aumentaFrase {
    public static void main(String[] args) {
        
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();

        } catch (Exception e) {
            System.out.println("A frase inicial está nula, " +
            "para solucional tal o problema, foi lhe atribuito um valor default.");

            frase = "frase vazia";
        } finally {
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }
}
