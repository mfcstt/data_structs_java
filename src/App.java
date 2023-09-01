import digitacao.EntradaTeclado;

public class App {
    public static void main(String[] args) throws Exception {

        EntradaTeclado tcl = new EntradaTeclado();

        String nome = tcl.texto("Digite seu nome: ");
        int idade = tcl.inteiro("Digite sua idade: ", "Erro, digite um valor numérico", true);

    }
}