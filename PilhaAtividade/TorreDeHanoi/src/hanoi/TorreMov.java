package hanoi;

public class TorreMov {
    public static void main(String[] args) throws Exception {
        int disco01 = 1;
        int disco02 = 2;
        int disco03 = 3;
        int disco04 = 4;
        int disco05 = 5;

        int TorreDeHanoi[] = new int[5];

        TorreA.empilhar(TorreDeHanoi, disco05);
        TorreA.empilhar(TorreDeHanoi, disco04);
        TorreA.empilhar(TorreDeHanoi, disco03);
        TorreA.empilhar(TorreDeHanoi, disco02);
        TorreA.empilhar(TorreDeHanoi, disco01);

        System.out.println("Torre A: " + TorreDeHanoi[0]);
        System.out.println("Torre A: " + TorreDeHanoi[4]);

    }
}
