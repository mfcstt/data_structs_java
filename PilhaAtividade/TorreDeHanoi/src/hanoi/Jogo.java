package hanoi;

public class Jogo {
    public static void main(String[] args) throws Exception {
        int disco01 = 1;
        int disco02 = 2;
        int disco03 = 3;
        int disco04 = 4;
        int disco05 = 5;


        TorreA.empilhar( disco05);
        TorreA.empilhar( disco04);
        TorreA.empilhar( disco03);
        TorreA.empilhar( disco02);
        TorreA.empilhar( disco01);

        do {
            
            System.out.println("Torre A");
            imprimeJogo.imprimeTorre(TorreA.torre);
            
            System.out.println( "\n" + "Torre B");
            imprimeJogo.imprimeTorre(TorreB.torre);
            
            System.out.println( "\n" + "Torre C");
            imprimeJogo.imprimeTorre(TorreC.torre);
            
            MovimentoDisco.movimentaDisco();
        }
        while(verificarJogoGanho.jogoGanho() == false);


    }
}
