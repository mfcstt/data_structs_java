public class App {

    // Matriz 3x6 do tipo String acessível a qualquer parte do programa.

    public static String[][] vendedores = new String[3][6];
    public static int mediaTotal;

    public static void main(String[] args) {

        // A matriz deverá conter os seguintes dados:
        // Coluna 0 : nome de um vendedor.
        // Coluna 1 : total de vendas no primeiro quadrimestre.
        // Coluna 2 : total de vendas no segundo quadrimestre.
        // Coluna 3 : total de vendas no terceiro quadrimestre.
        // Coluna 4: média das vendas do vendedor
        // Coluna 5: porcentagem da média do vendedor em relação a média de todos os
        // vendedores.
        // Preencher as 4 primeiras colunas.

        vendedores[0][0] = "Mafe";
        vendedores[0][1] = "100";
        vendedores[0][2] = "200";
        vendedores[0][3] = "300";
        vendedores[0][4] = "0";
        vendedores[0][5] = "0";

        vendedores[1][0] = "Guilherme";
        vendedores[1][1] = "1000";
        vendedores[1][2] = "2000";
        vendedores[1][3] = "3000";
        vendedores[1][4] = "0";
        vendedores[1][5] = "0";

        vendedores[2][0] = "Luciano";
        vendedores[2][1] = "10000";
        vendedores[2][2] = "20000";
        vendedores[2][3] = "30000";
        vendedores[2][4] = "0";
        vendedores[2][5] = "0";

        mediaVendas();
        mediaTotal();
        porcentagem();
        imprimirMatriz();
    }

    // Função para calculo da média de vendas de cada vendedor

    // Recuperar os valores da coluna 1, 2 e 3, converter para inteiro e realizar o
    // calculo da média.
    // Armazenar o resultado na coluna 4.
    public static void mediaVendas() {
        for (int i = 0; i < vendedores.length; i++) {
            int soma = 0;
            for (int j = 1; j < 4; j++) {
                soma += Integer.parseInt(vendedores[i][j]);
            }

            vendedores[i][4] = String.valueOf(soma / 3);
        }
    }

    // Função para calculo da média de todas as vendas.

    // Recuperar os valores da coluna 4, converter para inteiro e realizar o calculo
    // da média.
    public static void mediaTotal() {
        int soma = 0;
        for (int i = 0; i < vendedores.length; i++) {
            soma += Integer.parseInt(vendedores[i][4]);
        }
        mediaTotal = soma / vendedores.length;
    }

    // Função para calculo de porcentagem

    // Recuperar a media dos vendedores da coluna 4, transformando-os para inteiro e
    // realizar o calculo conforme enunciado
    public static void porcentagem() {
        for (int i = 0; i < vendedores.length; i++) {
            int media_vendedor = Integer.parseInt(vendedores[i][4]);
            if (media_vendedor > mediaTotal) {
                vendedores[i][5] = String.valueOf(((media_vendedor / (double) mediaTotal) - 1) * 100);
            } else {
                vendedores[i][5] = String.valueOf((media_vendedor / (double) mediaTotal) * 100);
            }
        }
    }

    // Percorrer a matriz e imprimir os valores
    public static void imprimirMatriz() {
        for (int i = 0; i < vendedores.length; i++) {

            System.out.println("Vendedor(a):" + vendedores[i][0] + "\t");
            System.out.println("Total de vendas no primeiro quadrimestre: " + vendedores[i][1] + "\t");
            System.out.println("Total de vendas no segundo quadrimestre: " + vendedores[i][2] + "\t");
            System.out.println("Total de vendas no terceiro quadrimestre: " + vendedores[i][3] + "\t");
            System.out.println("Média das vendas do vendedor: " + vendedores[i][4] + "\t");
            System.out.printf("Porcentagem da média do vendedor em relação a média de todos os vendedores: %.2f %% %n",
                    Double.parseDouble(vendedores[i][5]));

            System.out.println();

        }
    }
}