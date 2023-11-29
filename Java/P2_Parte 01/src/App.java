import digitacao.EntradaDeDados;

public class App {
    // Crie duas matrizes 3x4 do tipo float acessível a qualquer parte do programa.
    public static float[][] matriz01 = new float[3][4];
    public static float[][] matriz02 = new float[3][4];

    public static void main(String[] args) throws Exception {

        // Passar o nome da matriz como parâmetro para inicializa-la com 0 , preencher e
        // depois imprimi-la
        iniciarMatriz(matriz01);
        preencherMatriz(matriz01);
        imprimirMatriz(matriz01);
    }

    // 2) Crie uma função para iniciar as matrizes com o valor zero em todas as
    // posições.
    public static void iniciarMatriz(float[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    // 3) Escreva uma função para preencher uma das Matrizes
    public static void preencherMatriz(float[][] matriz) {
        // uso do pacote digitacao
        EntradaDeDados entrada = new EntradaDeDados();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = entrada.floatValue("Digite um valor para preencher a matriz: ", "Valor inválido", true);

            }
        }

    }

    // imprimir matriz
    public static void imprimirMatriz(float[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}