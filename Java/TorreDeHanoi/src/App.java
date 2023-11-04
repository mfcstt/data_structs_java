import java.util.Arrays;
import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Inicialize as torres
        String[] torre1 = {
            "             ***  ",
            "            *****  ",
            "          *********  ",
            "         ***********  ",
            "        *************",
            "       ***************",
            "      *****************  ",
            "     *******************  ",
            "    *********************  ",
            "   ***********************   "
        };

        String[] torre2 = new String[10];
        String[] torre3 = new String[10];

        // Preencha as torres vazias com espaços
        Arrays.fill(torre2, "                          ");
        Arrays.fill(torre3, "                          ");

        // Imprima as torres iniciais
        imprimirTorres(torre1, torre2, torre3);

        // Enquanto o jogo não estiver resolvido, peça ao usuário para fazer um movimento
        while (!isResolvido(torre3)) {
            System.out.println("Digite a torre de origem (1, 2 ou 3):");
            int origem = scanner.nextInt();

            System.out.println("Digite a torre de destino (1, 2 ou 3):");
            int destino = scanner.nextInt();

            if (origem == 1 && destino == 2) {
                moverDisco(torre1, torre2);
            } else if (origem == 1 && destino == 3) {
                moverDisco(torre1, torre3);
            } else if (origem == 2 && destino == 1) {
                moverDisco(torre2, torre1);
            } else if (origem == 2 && destino == 3) {
                moverDisco(torre2, torre3);
            } else if (origem == 3 && destino == 1) {
                moverDisco(torre3, torre1);
            } else if (origem == 3 && destino == 2) {
                moverDisco(torre3, torre2);
            }

            // Imprima as torres após cada movimento
            imprimirTorres(torre1, torre2, torre3);
        }

        System.out.println("Parabéns, você resolveu a Torre de Hanoi!");
    }

    public static void imprimirTorre(String[] torre) {
        for (int i = 0; i < torre.length; i++) {
            System.out.println(torre[i]);
        }
    }

    public static void imprimirTorres(String[] torre1, String[] torre2, String[] torre3) {
        System.out.println("Torre 1:");
        imprimirTorre(torre1);

        System.out.println("Torre 2:");
        imprimirTorre(torre2);

        System.out.println("Torre 3:");
        imprimirTorre(torre3);
    }

    public static void moverDisco(String[] origem, String[] destino) {
        int origemIndex = -1;
        int destinoIndex = -1;

        for (int i = origem.length - 1; i >= 0; i--) {
            if (!origem[i].trim().isEmpty()) {
                origemIndex = i;
                break;
            }
        }

        for (int i = destino.length - 1; i >= 0; i--) {
            if (!destino[i].trim().isEmpty()) {
                destinoIndex = i;
                break;
            }
        }

        destinoIndex++;

        if (origemIndex == -1 || (destinoIndex > 0 && origem[origemIndex].trim().length() > destino[destinoIndex - 1].trim().length())) {
            System.out.println("Movimento inválido. Verifique as regras do jogo.");
            return;
        }

        destino[destinoIndex] = origem[origemIndex];
        origem[origemIndex] = "                          ";
    }

    public static boolean isResolvido(String[] torre) {
        for (int i = 0; i < torre.length; i++) {
            if (torre[i].trim().isEmpty()) {
                return false;
            }
        }

        return true;
    }
}