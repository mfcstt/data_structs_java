import digitacao.EntradaDeDados;

public class App {

    public static void main(String[] args) {

        EntradaDeDados entrada = new EntradaDeDados();

        int teste = entrada.inteiro("Digite um número", "Insira inteiro", true);
        System.out.println(teste);
    }
}
