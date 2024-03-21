package hanoi;



import java.util.Scanner;

public class TorreA {

    static Scanner teclado = new Scanner(System.in);
    
    static int[] torre = new int[5]; 
    static int top = -1;

    
    public static boolean estaCheia(){
        return top == torre.length - 1;
    }

    public static boolean estaVazia(){
        return top == -1;
    }


    public static void empilhar(int torre[], int disco){
            if (!estaCheia()){
              top++;
              torre[top] = disco;
                }
            else{
                throw new RuntimeException("Torre Cheia.");
            }
        }
    
    public static int desempilhar(int torre[]){
        int disco = 0;
        if (!estaVazia()){
            disco = torre[top];
            torre[top] = 0;
            top--;   
        }
        else{
            throw new RuntimeException("Torre vazia.");
        }
        return disco;
    }
    
    public static int consultaTop(int torre[]){
        if (!estaVazia()){
            return torre[top];

        }
        else{
            throw new RuntimeException("Torre vazia.");
        }
    }
    
    public static String avaliar(){
        String aux = "";
        for (int valor : torre) {
            aux += valor + " -> ";
        }
        return aux;
    }
    
}
