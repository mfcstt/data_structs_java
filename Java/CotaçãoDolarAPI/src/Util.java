import java.io.BufferedReader;
import java.io.IOException;

// aqui 
public class Util {
    public static String[] converteJsonParaString(BufferedReader buffer) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffer.readLine()) != null) {
            jsonEmString += resposta;

        }
        String[] vetor = jsonEmString.split("\\{");
        return vetor;
    }

}
