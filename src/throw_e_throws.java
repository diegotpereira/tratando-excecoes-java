public class throw_e_throws {

    //lançando excessão
    private static void aumentarLetras() throws Exception { // Substituir NullPointerException

        String frase = null;
        String novaFrase = null;
        // novaFrase = frase.toUpperCase();

        // System.out.println("Frase antiga:" + frase);
        // System.out.println("Frase nova: " + novaFrase);

        try {
            novaFrase = frase.toUpperCase();

        } catch (NullPointerException e) {
            // Tratamento
            throw new Exception();
        }
        System.out.println("Frase antiga:" + frase);
        System.out.println("Frase nova: " + novaFrase);
    }
    public static void main(String[] args) {

        try {
            aumentarLetras();

        } catch (Exception e) { // Substituir NullPointerException
            
            System.out.println("Ocorreu um " + 
            "NullPointerException ao executar o método aumentarLetra() " + e); 
        }
    }
}
