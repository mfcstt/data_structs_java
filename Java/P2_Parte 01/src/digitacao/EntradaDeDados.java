package digitacao;

import java.util.Scanner;

public class EntradaDeDados {

    static Scanner entrada = new Scanner(System.in);

    public static String texto(String mensagem) {

        System.out.println(mensagem);
        String dado = entrada.nextLine();
        return dado;

    }

    // A cada digitação de valores será necessário verificar se o valor digitado
    // pode ser armazenado na matriz.
    // Se a digitação estiver errada, apresente uma mensagem e solicite a digitação
    // novamente
    public float floatValue(String mensagem, String msgerro, boolean repetir) {

        float dado = 0;
        boolean erro = false;
        do {
            String digitado = texto(mensagem);
            try {
                dado = Float.parseFloat(digitado);
                erro = false;
            } catch (RuntimeException e) {
                System.out.println(msgerro);
                erro = repetir;
            }

        } while (erro == true);

        return dado;
    }

}
