public class TesteLeitor {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        int valorInteiro;
        String frase;

        System.out.println("Digite o um valor inteiro");
        valorInteiro = leitor.leInteiro();

        System.out.println("Digite uma frase");
        frase = leitor.leString();
    }
}
