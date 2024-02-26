import java.util.Scanner;

public class Lista {

    static String [] lista = new String[10];
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        adicionaDado();
        
    }
    
    static void adicionaDado(){

        while () {
            
        }
        boolean repetir = true;
        System.out.println("Adicionando dados");
        String dadoInserido = scanner.nextLine();
    
        ListaRegras.adicionar(dadoInserido, lista);
    
        for (String dado : lista) {
            System.out.println(dado);
        }

    }
    
    
}
