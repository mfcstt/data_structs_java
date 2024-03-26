package validacao;
import java.util.Scanner;

public class Validar {
    static Scanner teclado = new Scanner(System.in);

    public static String validaPaciente(String mensagem, String MsgErro, boolean repetir){
        System.out.println(mensagem);
        String dado = teclado.nextLine();

        if(dado.length() < 3){
            System.out.println(MsgErro);
            }
        

        return dado;
    }

    public static int validaOpcaoMenu(String mensagem, String msgErro, boolean repetir) {
      int dado = 0;
      boolean erro;

      do {
        System.out.println(mensagem);
        String aux = teclado.nextLine();
        try {
          dado = Integer.parseInt(aux);
          erro = false;
        } catch (NumberFormatException e) {
          System.out.println(msgErro);
          erro = repetir;
        }
      } while (erro);

      return dado;
    }


    }

