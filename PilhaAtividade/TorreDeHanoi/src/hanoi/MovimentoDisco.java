package hanoi;
import validacao.validaMovimento;

public class MovimentoDisco {

    static boolean mover = false;
    static int origem = 0;
    static int destino = 0;

    public static void movimentaDisco(){
        do{
            origem = validaMovimento.validarMovimento("De qual torre deseja mover o disco?", "Digite um numero inteiro", true);
            if(origem < 1 || origem > 3){
                System.out.println("Torre inexistente");
            }
            else{
                mover = true;
            }
        }while(!mover);
         mover = false;

         do {
             destino = validaMovimento.validarMovimento("Para qual torre deseja mover o disco?", "Digite um numero inteiro", true);
             if(destino < 1 || destino > 3){
                 System.out.println("Torre inexistente");
             }
             else{
                 mover = true;
             }
            }while(!mover);


        switch (origem) {
            case 1:
            if (TorreA.estaVazia()) {
                System.out.println("Torre de origem vazia");
                break;
            }
            else{
                int discoTopA = TorreA.consultaTop();

                if (destino == 2) {
                    int discoTopB = TorreB.consultaTop();
                    VerificaDisco.verificaTamanhoDisco(discoTopA, discoTopB);
                    if (mover) {
                    TorreB.empilhar(TorreA.desempilhar());
                    }
                    break;
                }
                else if (destino == 3) {
                    int discoTopC = TorreC.consultaTop();
                    VerificaDisco.verificaTamanhoDisco(discoTopA, discoTopC);
                    if (mover) {
                    TorreC.empilhar(TorreA.desempilhar());
                    }
                    break;
                }
                break;
            }
            
            case 2:
            if (TorreB.estaVazia()) {
                System.out.println("Torre de origem vazia");
                break;
            }
            else{
                int discoTopB = TorreB.consultaTop();
                if (destino == 1) {
                    int discoTopA = TorreA.consultaTop();
                    VerificaDisco.verificaTamanhoDisco(discoTopB, discoTopA);
                    if (mover) {
                    TorreA.empilhar(TorreB.desempilhar());
                    }
                    break;
                }
                else if (destino == 3) {
                    int discoTopC = TorreC.consultaTop();
                    VerificaDisco.verificaTamanhoDisco(discoTopB, discoTopC);
                    if (mover) {
                    TorreC.empilhar(TorreB.desempilhar());
                    }
                    break;
                }
                break;
            }
            
            case 3:
            if (TorreC.estaVazia()) {
                System.out.println("Torre de origem vazia");
                break;
            }
            else{
                int discoTopC = TorreC.consultaTop();
                if (destino == 1) {
                    int discoTopA = TorreA.consultaTop();
                    VerificaDisco.verificaTamanhoDisco(discoTopC, discoTopA);
                    if (mover) {
                    TorreA.empilhar(TorreC.desempilhar());
                    }
                    break;
                }
                else if (destino == 2) {
                    int discoTopB = TorreB.consultaTop();
                    VerificaDisco.verificaTamanhoDisco(discoTopC, discoTopB);
                    if (mover) {
                    TorreB.empilhar(TorreC.desempilhar());
                    }
                    break;
                }
                break;
            }
        }
         
     
     
    }
}

