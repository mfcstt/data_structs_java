import digitacao.EntradaTeclado;

public class App {

    private static String[] aluno = new String[2];
    private static double[][] notas = new double[2][3];
    private static double[] medias = new double[2];

    public static void main(String[] args) {

        EntradaTeclado teclado = new EntradaTeclado();

        for (int a = 0; a < aluno.length; a++) {
            String nome = teclado.texto("digite o nome do al");
            for (int i = 0; i < notas[0].length; i++) {
                double nota = 0;
                boolean erro = false;
                do {
                    try {
                        nota = teclado.decimal("digite a nota  do aluno");
                        erro = false;
                    } catch (Exception ex) {
                        erro = true;
                        System.out.println("Digite um valor númerico");
                    }
                } while (erro == true);

                notas[a][i] = nota;
            }
            aluno[a] = nome;
        }

    }

}
