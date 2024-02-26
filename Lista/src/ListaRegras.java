public class ListaRegras{


    static public void adicionar(String dado, String[] vetor) {
            if (vetor[vetor.length -1] == null || 
            Integer.parseInt(vetor[vetor.length-1]) < Integer.parseInt(dado) ) {
            vetor[vetor.length-1] = dado; 
            }
        System.out.println("inseri");
    }


    static public String excluir(String dado, String[] vetor) {
       System.out.println("Exclui dado");
    return null;
    }


    static public boolean consultar(String dado, String[] vetor) {
        System.out.println("Consultei dado");
        return false;
    }
    
}
