import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Path caminhoEntrada = Paths.get("src/processatexto/entrada.txt");
        List<String> dados = null;
        Path localGravacao = Paths.get("src/processatexto/saida.txt");

        try {
            dados = lerArquivo(caminhoEntrada);
        } catch (IOException ex) {
            System.out.println("Arquivo de entrada não existe");
            System.exit(0);
        }

        String novosDados = processarArquivo(dados);
        try {
            gravarArquivo(localGravacao, novosDados);
        } catch (IOException ex) {
            System.out.println("Arquivo de saída não foi gerado.");
            System.exit(0);
        }
    }

    private static void gravarArquivo(Path local, String info) throws IOException {
        Files.writeString(local, info, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
    }

    static List<String> lerArquivo(Path arquivo) throws IOException {
        return Files.readAllLines(arquivo);
    }

    private static String processarArquivo(List<String> info) {
        String invertido = " ";

        for (String linha : info) {
            invertido = linha + "\n" + invertido;
        }

        return invertido;
    }

}