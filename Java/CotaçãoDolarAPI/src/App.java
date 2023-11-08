
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String inicio = "";
        String fim = "";

        System.out.println("Digite a data inicial do periodo (mm-dd-yyyy): ");
        inicio = teclado.nextLine();

        System.out.println("Digite a data final do periodo (mm-dd-yyyy): ");
        fim = teclado.nextLine();
        List<Cotacao> cotacoes = new ArrayList<>();

        // aqui, o vetor cotacoes recebe o vetor de strings retornado pelo metodo
        try {

            cotacoes = ServicoCotacaoBC.porperiodo(inicio, fim); // metodo
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        for (Cotacao cotacao : cotacoes) {
            System.out.println(cotacao);
        }
        ;

        teclado.close();
    }

}
