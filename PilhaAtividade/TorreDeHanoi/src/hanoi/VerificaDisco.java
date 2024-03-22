package hanoi;

public class VerificaDisco {

    public static void verificaTamanhoDisco(int disco, int topo){
            if(disco < topo){
                MovimentoDisco.mover = true;
            }
            else{
                System.out.println("Disco maior que o topo da torre de destino");
                MovimentoDisco.mover = false;
            }

    }
}
