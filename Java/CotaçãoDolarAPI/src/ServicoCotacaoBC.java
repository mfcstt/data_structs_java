import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

class ServicoCotacaoBC {
    private static List<Cotacao> lista = new ArrayList<>();
    // metodo que retorna um vetor de strings com as cotacoes

    // aqui, o vetor cotacoes recebe o vetor de strings retornado pelo metodo
    static List<Cotacao> porperiodo(String inicio, String fim) throws Exception {
        String webservice = "https://olinda.bcb.gov.br/olinda/servico"
                + "/PTAX/versao/v1/odata/CotacaoDolarPeriodo"
                + "(dataInicial=@dataInicial,dataFinalCotacao=@dataFinalCotacao)?"
                + "@dataInicial='{inicio}'&"
                + "@dataFinalCotacao='{fim}'&"
                + "$top=100&$format=json&"
                + "$select=cotacaoCompra,cotacaoVenda,"
                + "dataHoraCotacao";

        // substituir os parametros no webservice
        webservice = webservice.replace("{inicio}", inicio);
        webservice = webservice.replace("{fim}", fim);

        // estabelecer conexao com o webservice
        try {
            URL url = new URL(webservice);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            // verificar se a conexao foi estabelecida
            if (conexao.getResponseCode() != 200) {
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }
            InputStreamReader aux = new InputStreamReader(conexao.getInputStream());
            BufferedReader resposta = new BufferedReader(aux);

            // converter a resposta do webservice (em json) em um vetor de strings
            String[] jsonEmString = Util.converteJsonParaString(resposta);

            // Objeto de conversao usando função do google
            Gson gson = new Gson();

            // vetor de cotacoes
            for (int i = 2; i < jsonEmString.length; i++) {
                String auxiliar = "(" + jsonEmString[i].replace("}", "}");
                auxiliar = auxiliar.replace("}", ")");
                lista.add(gson.fromJson(auxiliar, Cotacao.class));
            }

            return lista;

        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar webservice" + e);

        }

    }

}
