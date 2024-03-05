package listamatriz;

public class ListaMatriz {
    public static void main(String[] args) throws Exception {

        String[][] espera = new String[10][2];

        System.out.println("\nReservas vazias: \n");
        System.out.println(Lista.exibir(espera));

        System.out.println("Reservados: \n");
        Lista.inserir("Gui", 2, espera);
        Lista.inserir("Mafe", 4, espera);
        System.out.println(Lista.exibir(espera));

        System.out.println("Consultar lugar reservado: \n");
        var chamando = Lista.chamar(4, espera);
        System.out.println("Chamando " + chamando[0]);
        System.out.println(Lista.exibir(espera));

        System.out.println("Substituir lugar reservado\n");
        Lista.inserir("Rick", 7, espera);
        System.out.println(Lista.exibir(espera));


    }

}