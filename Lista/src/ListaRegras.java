public class ListaRegras{


    static public void adicionar(String dado, String[] vetor) {
            if (vetor[vetor.length -1] == null || 
            Integer.parseInt(vetor[vetor.length-1]) < Integer.parseInt(dado) ) {
            vetor[vetor.length-1] = dado; 
            }

            reordenar(vetor);
            
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

    private static void reordenar(String vetor[]) {

        for (byte pos = (byte) (vetor.length - 1); pos > 0; pos--) {
    
          if (vetor[pos - 1] == null || Integer.parseInt(vetor[pos]) > Integer.parseInt(vetor[pos - 1])) {
    
            String aux = vetor[pos - 1];
            vetor[pos - 1] = vetor[pos];
            vetor[pos] = aux;
    
          } else {
            break;
          }
    
        }
    
      }
    
}
