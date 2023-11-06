import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class ServicoCotacaoBC {

    // metodo que retorna um vetor de strings com as cotacoes

    public static String[] porperiodo(String inicio, String fim) {
        String webservice = "https://olinda.bcb.gov.br/olinda/servico"
                + "/PTAX/versao/v1/odata/CotacaoDolarPeriodo"
                + "(dataInicial=@dataInicial,dataFinalCotacao=@dataFinalCotacao)?"
                + "@dataInicial='09-04-2023'&"
                + "@dataFinalCotacao='10-04-2023'&"
                + "$top=100&$format=json&"
                + "$select=cotacaoCompra,cotacaoVenda,"
                + "dataHoraCotacao";
        return null;

        // estabelecer conexao com o webservice
        try {
            URL url = new URL(webservice);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            // verificar se a conexao foi estabelecida
            if (conexao.getResponseCode() != 200) {
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
                InputStreamReader aux = new InputStreamReader(conexao.getInputStream());
                BufferedReader resposta = new BufferedReader(aux);

                // converter a resposta do webservice (em json) em um vetor de strings
                String[] jsonString = Util.converteJsonParaString(resposta);

                // Objeto de conversao usando função do google
                Gson gson = new Gson();

                for (int i = 2; i < jsonString.length; i++) {
                    String auxiliar = "(" + jsonString[i].replace("}", "}");
                    auxiliar = auxiliar.replace("}", ")");
                    lista.add(gson.fromJson(auxiliar, Cotacao.class));
                }

                return lista;

            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar webservice" + e);
        }

    }

}
