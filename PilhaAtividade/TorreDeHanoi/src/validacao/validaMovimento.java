package validacao;
import java.util.Scanner;

public class validaMovimento {
    static Scanner teclado = new Scanner(System.in);

    public static String texto(String mensagem){
        System.out.println(mensagem);
        String dado = teclado.nextLine();

        return dado;
    }

    public static int validarMovimento(String mensagem, String Msgerro, boolean repetir){
        int dado = 0;
        boolean erro = false;

        do{
            String aux = texto(mensagem);
            try{
                dado = Integer.parseInt(aux);
                erro = false;
            }catch(NumberFormatException e){
                System.out.println(erro);
                erro = repetir;
            }
        }while(erro);
        return dado;

    }
}
