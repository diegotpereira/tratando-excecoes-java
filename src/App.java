public class App {
    public static void main(String[] args) throws Exception {

        String frase = null;
        String novaFrase = null;

        // novaFrase = frase.toUpperCase();

        // System.out.println("Frase antiga: " + frase);
        // System.out.println("Frase nova: " + novaFrase);

        try {
            novaFrase = frase.toUpperCase();

        //CAPTURA DA POSSÍVEL exceção.    
        } catch (Exception e) {
            // Tratamento da exceção
            System.out.println("A frase inicial está nula, " +
            "para solucional tal o problema, foi lhe atribuito um valor default.");
            frase = "Frase vazia";
            novaFrase = frase.toUpperCase();
        }
        System.out.println("frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }
}
