public class TratamentoArray {
    public static void main(String[] args) {
        String[] amigos = { "Cláudio", "Vanessa","Raul", "Silva"};

        // for(byte num = 1; num <= amigos.length; num++) {

        //     System.out.println("Amigo " + num + ": " + amigos[num]);
        // }
        for(byte num = 0; num <= amigos.length; num++) {

            System.out.println("Amigo " + (num + 1) + ": " + amigos[num]);
        }
    }
}
