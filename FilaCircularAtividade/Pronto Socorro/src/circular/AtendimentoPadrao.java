package circular;
public class AtendimentoPadrao{

    static String fila[] = new String[5];
    static int inicio = -1;
    static int fim = -1;
    static int elementos = 0;

    static boolean estaCheia(){
        return (elementos == fila.length);
    }

    static boolean estaVazia(){
        return (elementos == 0);
    }


    static void inserir(String valor){
        if(!estaCheia()){
          fim = (fim + 1) == fila.length ? 0 : fim + 1;
          fila[fim] = valor;
          elementos++;
          inicio = (inicio == -1 ? 0 : inicio);
    }
    else{
        throw new RuntimeException("Fila cheia");

}

    }

    static String remover(){
        String i;;
        if(!estaVazia()){
            i = fila[inicio];
            fila[inicio++] = "";
            inicio = (inicio == fila.length ? 0 : inicio);
            elementos--;
    }
    else{
        throw new RuntimeException("Fila vazia");
    }
    return String.valueOf(i);
    }
    

    static String imprimir(){
        String aux = "";
        for(String conteudo : fila){
            aux += conteudo + " ";
        }
        return aux += "\n";
     
    }
    
}


