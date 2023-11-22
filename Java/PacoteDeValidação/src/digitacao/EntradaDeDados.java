package digitacao;

import java.util.Scanner;

public class EntradaDeDados {

    static Scanner entrada = new Scanner(System.in);

    public static String texto(String mensagem) {

        System.out.println(mensagem);
        String dado = entrada.nextLine();
        return dado;

    }

    public int inteiro(String mensagem, String msgerro, boolean repetir) {

        int dado = 0;
        boolean erro = false;
        do {
            String digitado = texto(mensagem);
            try {
                dado = Integer.parseInt(digitado);
                erro = false;
            } catch (RuntimeException e) {
                System.out.println(msgerro);
                erro = repetir;
            }

        } while (erro == true);

        return dado;
    }

}
