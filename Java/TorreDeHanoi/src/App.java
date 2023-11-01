import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // O objectivo deste jogo consiste em deslocar todos os discos da haste onde se
        // encontram para uma haste diferente, respeitando as seguintes regras: deslocar
        // um disco de cada vez, o qual deverá ser o do topo de uma das três hastes;
        // cada disco nunca poderá ser colocado sobre outro de diâmetro mais pequeno. O
        // jogo termina quando todos os discos estiverem empilhados numa das hastes,
        // respeitando a regra acima referida.

        // qual a torre de destino (não pode mover para a mesma)
        // qual a torre de origem (não pode mover para a mesma)
        // 3 discos 8 movimentos
        // 10 discos 1024 movimentos
        // 3 torres
        // valores do disco
        // redesenhar a torre e imprimi-la (vetor)
        // menor quantidade de movimentos
        // quantidade de movimentos
        // criar 3 vetores (deslocar os discos entre eles)
        // função para imprimir as torres

        String[] torre1 = { "             ***  ",
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
        // String[] torre2 =
        // String[] torre3 =
        System.out.println(imprimirTorre(torre1));

    }

    public static String imprimirTorre(String[] torre1) {
        // for
        System.out.println("Torre 1: " + "\n" + torre1[0] + "\n" + torre1[1] + "\n" + torre1[2] + "\n" + torre1[3]
                + "\n" + torre1[4] + "\n" + torre1[5] + "\n" + torre1[6] + "\n" + torre1[7] + "\n" + torre1[8] + "\n"
                + torre1[9]);
        // System.out.println("Torre 2: " + "\n" + torre1[0] + "\n" + torre1[1] + "\n" +
        // torre1[2]);
        // System.out.println("Torre 3: " + "\n" + torre1[0] + "\n" + torre1[1] + "\n" +
        // torre1[2]);

        return "";
    }

}
