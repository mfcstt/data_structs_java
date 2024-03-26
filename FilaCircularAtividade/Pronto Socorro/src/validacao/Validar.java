package validacao;
import java.util.Scanner;

public class Validar {
    static Scanner teclado = new Scanner(System.in);

    public static String validaPaciente(String mensagem, String msgErro, boolean repetir) {
      boolean erro;
      String dado = "";

      do {
          System.out.println(mensagem);
          dado = teclado.nextLine();
          erro = dado.length() < 3 || !dado.matches("[a-zA-Z]+");
          if (erro) {
              System.out.println(msgErro);
          }
      } while (repetir && erro);

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

