import digitacao.EntradaTeclado;

public class App {
    public static void main(String[] args) throws Exception {

        EntradaTeclado tcl = new EntradaTeclado();

        String nome = tcl.texto("Digite seu nome: ");
        double altura = 0.0d;
        int idade = tcl.inteiro("Digite sua idade: ", "Erro, digite um valor numérico", true);

        boolean erro = false;

        do {
            try {
                altura = tcl.decimal("Digite sua altura em metros");
                erro = false;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                erro = true;
                altura = 0.0d;
            }
        } while (erro == true);
    }
}