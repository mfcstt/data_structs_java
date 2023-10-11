import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//importar pacote

public class App {
    public static void main(String[] args) throws Exception {
        Path caminhoEntrada = Paths.get("src/leituraDeArquivo/entrada.txt");
        List<String> dados;
        try {
            dados = lerArquivo(caminhoEntrada);
        } catch (IOException ex) {
            System.out.println("Arquivo de Entrada inexistente");
            System.out.println(0);
        }

        novosDados = processarArquivo(dados);
        gravarArquivo(localGravacao, novosDados);

    }

    private static List<String> lerArquivo(Path arquivo) throws IOException {
        return Files.readAllLines(arquivo);

    }
}
