
public class Cotacao {

    // transformar informar json em objeto em java
    private float cotatacaoCompra;
    private float cotacaoVenda;
    private String dataHoraCotacao;
    
// aqui estamos sobrescrevendo o metodo toString para que ele retorne os valores
    @Override
    public String toString() {
        return "{" + "[cotatacaoCompra:" + cotatacaoCompra + ", cotacaoVenda:" + cotacaoVenda + ", dataHoraCotacao:" + dataHoraCotacao + "}";
    }

// aqui utilizei o gerador de getters e setters para criar os metodos e atributos da classe para que possamos acessar os atributos privados
    public float getCotatacaoCompra() {
        return cotatacaoCompra;
    }

    public void setCotatacaoCompra(float cotatacaoCompra) {
        this.cotatacaoCompra = cotatacaoCompra;
    }

    public float getCotacaoVenda() {
        return cotacaoVenda;
    }

    public void setCotacaoVenda(float cotacaoVenda) {
        this.cotacaoVenda = cotacaoVenda;
    }

    public String getDataHoraCotacao() {
        return dataHoraCotacao;
    }

    public void setDataHoraCotacao(String dataHoraCotacao) {
        this.dataHoraCotacao = dataHoraCotacao;
    }

}
