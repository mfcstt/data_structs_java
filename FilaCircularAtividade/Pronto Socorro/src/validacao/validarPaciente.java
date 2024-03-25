package validacao;
import java.util.Scanner;

public class validaMovimento {
    static Scanner teclado = new Scanner(System.in);

    public static String texto(String mensagem, String MsgErro, boolean repetir){
        System.out.println(mensagem);
        String dado = teclado.nextLine();

        if(dado.length() < 3){
            System.out.println(MsgErro);
            }
        

        return dado;
    }


    }

