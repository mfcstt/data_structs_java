package hanoi;

public class imprimeJogo {
        static public void imprimeTorre(int torre[]){
            for (int i = torre.length - 1; i >= 0; i--) {
                System.out.println(torre[i]);
                
            }
        }
}
