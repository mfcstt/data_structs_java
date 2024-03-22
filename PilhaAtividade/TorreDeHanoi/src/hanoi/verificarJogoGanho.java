package hanoi;

public class verificarJogoGanho {
    public static boolean jogoGanho(){
        if(TorreC.estaCheia()){
            System.out.println("Parabéns, você ganhou!");
            return true;
        }
        else{
            return false;
        }
    }
}
