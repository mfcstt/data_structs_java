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
    
    public double doubleValue(String mensagem, String msgerro, boolean repetir) {

        double dado = 0.0;
        boolean erro = false;
        do {
            String digitado = texto(mensagem);
            try {
                dado = Double.parseDouble(digitado);
                erro = false;
            } catch (RuntimeException e) {
                System.out.println(msgerro);
                erro = repetir;
            }

        } while (erro == true);

        return dado;
    }
    
    public char charValue(String mensagem, String msgerro, boolean repetir) {

        char dado = 0;
        boolean erro = false;
        do {
            String digitado = texto(mensagem);
            try {
                if (digitado.length() == 1) {
                    dado = digitado.charAt(0);
                    erro = false;
                } else {
                    throw new RuntimeException();
                }
            } catch (RuntimeException e) {
                System.out.println(msgerro);
                erro = repetir;
            }

        } while (erro == true);

        return dado;
    }

}
