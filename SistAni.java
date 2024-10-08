public class SistemaAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Puck");
        cachorro.caminha();
        cachorro.late();

        Gato gato = new Gato("Luna");
        gato.caminha();
        gato.mia();
    }
}