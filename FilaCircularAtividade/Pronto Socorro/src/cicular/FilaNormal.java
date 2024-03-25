package circular;
public class FilaNormal {

    static int[] fila = new int[5];
    static int inicio = -1;
    static int fim = -1;
    static int elementos = 0;

    static boolean estaCheia(){
        int next = fim + 1;
        next = (next == fila.length ? 0 : next);
        return next == inicio ? true : false;
    }

    static boolean estaVazia(){
        return (elementos == 0);
    }


    static void inserir(int valor){
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
        int i;;
        if(!estaVazia()){
            i = fila[inicio];
            fila[inicio++] = 0;
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
        for(String conteudo : veor){
            aux += conteudo + " ";
        }
        aux += "\n";
        return aux;
    }
    
}


