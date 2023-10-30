package digitacao;

import java.util.Scanner;

public class EntradaTeclado {
    Scanner tcl = new Scanner(System.in);

    public String texto(String mensagem) {

        System.out.println(mensagem);
        String dado = tcl.nextLine();

        return dado;

    }

    public int inteiro(String mensagem, String msgErro, boolean repetir) {
        int dado = 0;
        boolean erro = false;
        do {
            String aux = texto(mensagem);
            try {
                dado = Integer.parseInt(aux);
                erro = false;
            } catch (RuntimeException e) {
                System.out.println(msgErro);
                erro = repetir;
            }
        } while (erro == true);

        return dado;
    }

    public double decimal(String mensagem) throws Exception {
        double dado = 0.0;
        String aux = texto(mensagem);
        aux = aux.replaceAll(",", ".");
        try {
            dado = Double.parseDouble(aux);
        } catch (Exception ex) {
            throw new Exception("Erro de digitação.");
        }
        return dado;
    }

}